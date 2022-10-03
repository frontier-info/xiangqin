package jp.frontierinfo.common.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import jp.frontierinfo.common.exception.BusinessException;

/**
 * @desc token验证
 * @author wu
 **/
public class TokenUtils {
	// 设置过期时间(用户登录信息)
	private static final long EXPIRE_TIME_LOGIN = 30 * 60 * 100000;
	// 设置过期时间(用户验证码)
	private static final long EXPIRE_TIME_VERIFICATION_CODE = 100 * 1000;
	// token秘钥
	private static final String TOKEN_SECRET = "FRONTIERIFNOQWERASD";

	public static String tokenForLogin(String account) {

		String token = "";
		try {
			// 过期时间
			Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME_LOGIN);
			// 秘钥及加密算法
			Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
			// 设置头部信息
			Map<String, Object> header = new HashMap<>();
			header.put("typ", "JWT");
			header.put("alg", "HS256");
			// 携带username信息，生成签名
			token = JWT.create()
					.withHeader(header)
					.withClaim("account", account)
					.withExpiresAt(date)
					.sign(algorithm);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return token;
	}

	public static String tokenForVerificationCode(String account, String verificationCode) {

		String token = "";
		try {
			// 过期时间
			Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME_VERIFICATION_CODE);
			// 秘钥及加密算法
			Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
			// 设置头部信息
			Map<String, Object> header = new HashMap<>();
			header.put("typ", "JWT");
			header.put("alg", "HS256");
			// 携带username，password信息，生成签名
			token = JWT.create()
					.withHeader(header)
					.withClaim("account", account)
					.withClaim("verificationCode", verificationCode)
					.withExpiresAt(date)
					.sign(algorithm);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return token;
	}
	
	public static boolean verifyAccount(String token, String account)
			throws BusinessException {
		
		Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
		JWTVerifier verifier = JWT.require(algorithm).build();
		
		try {
			
			DecodedJWT decodedJWT = verifier.verify(token);
			Map<String, Claim> claims = decodedJWT.getClaims();
			
			if (claims.containsKey("account")) {
				Claim accountFromToken = claims.get("account");
				
				if (!accountFromToken.asString().equals(account)) {
					throw new BusinessException("用户手机号不一致");
				}
			}
		} catch (TokenExpiredException e) {
			throw new BusinessException("用户登录已过期");
			
		} catch (SignatureVerificationException e) {
			throw new BusinessException("签名不一致");
			
		} catch (AlgorithmMismatchException e) {
			throw new BusinessException("算法不匹配");
			
		} catch (InvalidClaimException e) {
			throw new BusinessException("失效的payload");
			
		} catch (Exception e) {
			throw e;
			
		}
		return true;
	}
	public static boolean verifyVerificationCode(String token, String account, String verificationCode)
			throws BusinessException {

		Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
		JWTVerifier verifier = JWT.require(algorithm).build();

		try {

			DecodedJWT decodedJWT = verifier.verify(token);
			Map<String, Claim> claims = decodedJWT.getClaims();

			if (claims.containsKey("account") && claims.containsKey("verificationCode")) {
				Claim accountFromToken = claims.get("account");
				Claim verificationCodeFromToken = claims.get("verificationCode");

				if (!accountFromToken.asString().equals(account)) {
					throw new BusinessException("用户手机号不一致");
				}
				if (!verificationCodeFromToken.asString().equals(verificationCode)) {
					throw new BusinessException("手机验证码不正确");
				}
			}
		} catch (TokenExpiredException e) {
			throw new BusinessException("验证码已过期");

		} catch (SignatureVerificationException e) {
			throw new BusinessException("签名不一致");

		} catch (AlgorithmMismatchException e) {
			throw new BusinessException("算法不匹配");

		} catch (InvalidClaimException e) {
			throw new BusinessException("失效的payload");

		} catch (Exception e) {
			throw e;

		}
		return true;
	}


	public static void main(String[] args) throws BusinessException {
		String account = "18812345678";
		String verificationCode = "123456";
		String token = tokenForVerificationCode(account, verificationCode);
		System.out.println(token);
		System.out.println(verifyVerificationCode(token, "18812345678", "123456"));
	}
}