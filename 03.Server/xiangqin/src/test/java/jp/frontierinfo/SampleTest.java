package jp.frontierinfo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jp.frontierinfo.common.CommonTestCase;

public class SampleTest extends CommonTestCase{

    @BeforeEach
    public void setBefore() {
    	// 单元测试前备份数据库数据
    	backupDbData();
    }
    
    @AfterEach
    public void setAfter() {
    	// 单元测试结束后还原数据库数据
    	resumeDbData();
    }

    @Test
    public void test() {
        // 导入测试数据
    	inputData("testfile");
    }

}
