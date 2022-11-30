package jp.frontierinfo.ui.service;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.DateUtils;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S002002E001Input;
import jp.frontierinfo.ui.output.S002002E001Output;

@Service
public class S002002E001Service extends AbstractServiceImpl<S002002E001Input, S002002E001Output>{

	@Override
	public S002002E001Output execute(S002002E001Input input) throws BusinessException {

		// 获取服务器绝对路径
		String realpath = input.getRealpath();
		
		// 获取服务器相对路径
		String fileSavePath = input.getFileSavePath();
		
		T01UserBasicInfo basicInfo = t01UserBasicInfoAccess.selectByPrimaryKey(input.getUid());
		
		basicInfo.setUname(input.getUname());
    	basicInfo.setSex(input.getSex());
		basicInfo.setBirthDate(DateUtils.stringToDate(input.getBirthDate()));
		basicInfo.setAge(DateUtils.getAge(DateUtils.stringToDate(input.getBirthDate())));
		basicInfo.setBirthPlace(input.getBirthPlace());
		basicInfo.setAddress(input.getAddress());
		basicInfo.setProfession(input.getProfession());
		basicInfo.setInterest(input.getInterest());
		basicInfo.setUheight(input.getUheight());
		basicInfo.setIntroduce(input.getIntroduce());
		basicInfo.setUweight(input.getUweight());
		basicInfo.setIntroduce(input.getIntroduce());
		basicInfo.setAvatarImg(savefile(input.getAvatarImgFile(), realpath, fileSavePath));
		basicInfo.setUimages1(savefile(input.getUimages1File(), realpath, fileSavePath));
		basicInfo.setUimages2(savefile(input.getUimages2File(), realpath, fileSavePath));
		basicInfo.setUimages3(savefile(input.getUimages3File(), realpath, fileSavePath));
		basicInfo.setIdentificationImg(savefile(input.getIdentificationImgFile(), realpath, fileSavePath));
		basicInfo.setRequireAgeFrom(input.getRequireAgeFrom());
		basicInfo.setRequireAgeTo(input.getRequireAgeTo());
		basicInfo.setRequireBirthPlace(input.getRequireBirthPlace());
		basicInfo.setRequireAddress(input.getRequireAddress());
		basicInfo.setRequireProfession(input.getRequireProfession());
		basicInfo.setRequireHeightFrom(input.getRequireHeightFrom());
		basicInfo.setRequireHeightTo(input.getRequireHeightTo());
		basicInfo.setRequireWeightFrom(input.getRequireWeightFrom());
		basicInfo.setRequireWeightTo(input.getRequireWeightTo());
		
		t01UserBasicInfoAccess.updateByPrimaryKeySelective(basicInfo);
		
		// 提交个人信息更改时,若用户状态为00:未提交审核时,更新状态为01:审核中
		T01UserLoginInfo loginInfo = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		if(ConstantInfo.USER_CENSOR_STATUS_00.equals(loginInfo.getUserStatusCode())) {
			loginInfo.setUserStatusCode(ConstantInfo.USER_CENSOR_STATUS_01);
			t01UserLoginInfoAccess.updateByPrimaryKey(loginInfo);
		}
				
		return new S002002E001Output();
	}
	
	private String savefile(MultipartFile file, String realpath, String fileSavePath) {
		if(file.getSize() == 0) {
			return null;
		}
		
		String fileName = file.getOriginalFilename();
		File targetFile = new File(realpath, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// 上传
		try {
			file.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSavePath + "\\" + fileName;
	}

}
