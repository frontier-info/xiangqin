package jp.frontierinfo.ui.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import javax.annotation.Resource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ObjectUtils;

import jp.frontierinfo.common.CommonTestCase;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.DateUtils;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.start.XiangQinApplication;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.output.S001001E001Output;

/**
 * 登录页面的登录按钮点击的Service测试
 * @author wusongsong
 *
 */
@SpringBootTest(classes=XiangQinApplication.class)
public class S001001E001ServiceTest extends CommonTestCase {
	
	@Resource
	private S001001E001Service s001001E001Service;

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

    /**
     * 用户不存在
     */
    @Test
    public void test_001() {
        // 导入测试数据
    	inputData("testfile/S001001E001Service");
    	
    	// 准备测试对象方法的参数
    	S001001E001Input input = new S001001E001Input();
    	input.setEmail("1235");
    	input.setPassword("13245");
    	
    	try {
    		// 执行Service方法
			s001001E001Service.execute(input);
		} catch (BusinessException e) {
			// 验证错误信息
			assertEquals("用户不存在", e.getMessage());
		}
    	
    }

    /**
     * 用户密码输入错误
     */
    @Test
    public void test_002() {
        // 导入测试数据
    	inputData("testfile/S001001E001Service");
    	
    	// 准备测试对象方法的参数
    	S001001E001Input input = new S001001E001Input();
    	input.setEmail("1234");
    	input.setPassword("1234");
    	
    	try {
    		// 执行Service方法
			s001001E001Service.execute(input);
		} catch (BusinessException e) {
			// 验证错误信息
			assertEquals("用户手机号或密码错误", e.getMessage());
		}
    }

    /**
     * 用户密码验证成功
     */
    @Test
    public void test_003() {
        // 导入测试数据
    	inputData("testfile/S001001E001Service");
    	
    	// 准备测试对象方法的参数
    	S001001E001Input input = new S001001E001Input();
    	input.setEmail("1234");
    	input.setPassword("123");
    	
    	// 准备测试结果期待值
		S001001E001Output expectedOutput = new S001001E001Output();
		S001001E001Output actualOutput = new S001001E001Output();
		T01UserLoginInfo userLoginInfo = new T01UserLoginInfo();
		userLoginInfo.setUid("000004");
		userLoginInfo.setMobile("1234");
		userLoginInfo.setEmail("");
		userLoginInfo.setPassword("a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3");
		userLoginInfo.setUserStatusCode("00");
		userLoginInfo.setUserRankCode("01");
		userLoginInfo.setUserCensorResult("");
		userLoginInfo.setCreateTime(DateUtils.stringToTimestamp("2022/12/6 13:25:16.388"));
		userLoginInfo.setDeleteFlg(false);
		expectedOutput.setUserLoginInfo(userLoginInfo);
    	
    	try {
    		// 执行Service方法
    		actualOutput = s001001E001Service.execute(input);
		} catch (BusinessException e) {
			// 验证错误信息
			fail("发生异常");
		}
    	
    	// 验证Service返回值:用户Token
    	assertTrue(!ObjectUtils.isEmpty(actualOutput.getToken()));
    	
    }


}
