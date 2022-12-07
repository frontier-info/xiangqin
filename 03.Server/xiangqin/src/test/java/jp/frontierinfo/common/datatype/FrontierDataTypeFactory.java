package jp.frontierinfo.common.datatype;

import org.dbunit.dataset.datatype.DataType;
import org.dbunit.dataset.datatype.DataTypeException;
import org.dbunit.ext.postgresql.PostgresqlDataTypeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FrontierDataTypeFactory extends PostgresqlDataTypeFactory{
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(FrontierDataTypeFactory.class);

    public static final DataType POSTGRES_DATE = new DateDataType();
    
    public static final TimestampDataType POSTGRES_TIMESTAMP = new TimestampDataType();

    public DataType createDataType(int sqlType, String sqlTypeName) throws DataTypeException
    {
        logger.trace("createDataType(sqlType=" + sqlType + ", sqlTypeName=" + sqlTypeName + ") - start");


        // date
        if (sqlTypeName.startsWith("date"))
        {
            return POSTGRES_DATE;
        }
        // timestamp
        if (sqlTypeName.startsWith("timestamp"))
        {
        	return POSTGRES_TIMESTAMP;
        }

        return super.createDataType(sqlType, sqlTypeName);
    }

}
