package jp.frontierinfo.common.utils;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailUtils {
	
	public static Logger logger = LoggerFactory.getLogger(MailUtils.class);
	
	public static void sendMail(String to, String verificationCode) {


		logger.debug("发送邮件处理开始");

		// 发件人电子邮箱
		String from = "2807889324@qq.com";

		// 指定发送邮件的主机为 smtp.qq.com
		String host = "smtp.qq.com"; // QQ 邮件服务器

		// 获取系统属性
		Properties properties = System.getProperties();

		// 设置邮件服务器
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		
		try {
			
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.ssl.socketFactory", sf);
			// 获取默认session对象
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("2807889324@qq.com", "vuikbdtysusqdcjb"); // 发件人邮件用户名、密码
				}
			});

			// 创建默认的 MimeMessage 对象
			MimeMessage message = new MimeMessage(session);

			// Set From: 头部头字段
			message.setFrom(new InternetAddress(from));

			// Set To: 头部头字段
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: 头部头字段
			message.setSubject("相亲网-注册验证码");

			// 设置消息体
			message.setText("您正在 注册相亲网，验证码为："+verificationCode+"。");

			// 发送消息
			Transport.send(message);
			
			logger.debug("发送邮件处理结束");
			
		} catch (MessagingException mex) {
			logger.error("发送邮件失败"+mex.getLocalizedMessage());
		} catch (GeneralSecurityException gsex) {
			logger.error("发送邮件失败"+gsex.getLocalizedMessage());
		}
	
	}

}
