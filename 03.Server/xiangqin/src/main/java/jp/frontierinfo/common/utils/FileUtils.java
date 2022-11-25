package jp.frontierinfo.common.utils;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

	private static final Log logger = LogFactory.getLog(FileUtils.class);
	
	private static String fileSavePath = "resources\\userdata\\uid_";

	/**
	 * @param files
	 * @param request
	 * @return
	 */
	public static String upfiles(MultipartFile files, HttpServletRequest request, String uid) {
		
		String realpath = request.getServletContext().getRealPath(fileSavePath + uid);
		String fileName = files.getOriginalFilename();
		File targetFile = new File(realpath, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// 上传
		try {
			files.transferTo(targetFile);
			logger.info("上传成功:"+request.getServletContext());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSavePath + uid + "\\" + fileName;
	}

}
