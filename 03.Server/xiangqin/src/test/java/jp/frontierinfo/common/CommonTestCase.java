package jp.frontierinfo.common;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.dbunit.DatabaseUnitException;
import org.dbunit.DefaultDatabaseTester;
import org.dbunit.IDatabaseTester;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.xml.sax.InputSource;

import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.datatype.FrontierDataTypeFactory;

@SpringBootTest
@ContextConfiguration(locations= {"/springmvc-servlet.xml"})
public class CommonTestCase {
	
	@Autowired
	private Properties propertiesBean;
	
	public String backupFile = System.getProperty("user.dir")+"/testData.xml";
	
	/**
	 * 通过指定数据文件将测试数据导入数据库
	 * @param fileName
	 */
	public void inputData(String fileName) {
    
        IDatabaseConnection dbconn = getConnection();
        IDatabaseTester tester = new DefaultDatabaseTester(dbconn);
        tester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        IDataSet dataset = null;
		try {
			dataset = new CsvDataSet(new File(fileName));
			tester.setDataSet(dataset);
			tester.onSetup();
		} catch (DataSetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 单元测试前备份数据库数据
	 */
	public void backupDbData() {
        try {
            IDatabaseConnection con = this.getConnection();
            IDataSet createDataSet = con.createDataSet();
            FlatXmlDataSet.write(createDataSet, new FileWriter(backupFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * 单元测试结束后还原数据库数据
	 */
	public void resumeDbData() {
        try {
            IDatabaseConnection con = this.getConnection();
            IDataSet dataSet = new FlatXmlDataSet(new FlatXmlProducer(
                    new InputSource(backupFile)));
            // 清空数据库中的数据并插入xml中的数据
            DatabaseOperation.CLEAN_INSERT.execute(con,dataSet);
            // 删除xml临时文件
            File xmlDataFile = new File(backupFile);
            xmlDataFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	/**
	 * 获取数据库连接
	 * @return
	 */
	public IDatabaseConnection getConnection() {
        Connection conn = null;
        IDatabaseConnection dbconn = null;
		try {
			conn = DriverManager.getConnection(
					propertiesBean.getProperty(ConstantInfo.DATASOURCE_URL),
					propertiesBean.getProperty(ConstantInfo.DATASOURCE_USERNAME),
					propertiesBean.getProperty(ConstantInfo.DATASOURCE_PASSWORD));
			dbconn = new DatabaseConnection(conn, "xiangqin");
			dbconn.getConfig().setProperty(DatabaseConfig.FEATURE_ALLOW_EMPTY_FIELDS, true);
			dbconn.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new FrontierDataTypeFactory());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DatabaseUnitException e) {
			e.printStackTrace();
		}
        return dbconn;
	}

}
