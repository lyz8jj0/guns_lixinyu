package com.lixinyu.guns.rest.modular.auth.util;

import com.lixinyu.guns.rest.config.properties.JwtProperties;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>jwt token工具类</p>
 * <pre>
 *     jwt的claim里一般包含以下几种数据:
 *         1. iss -- token的发行者
 *         2. sub -- 该JWT所面向的用户
 *         3. aud -- 接收该JWT的一方
 *         4. exp -- token的失效时间
 *         5. nbf -- 在此时间段之前,不会被处理
 *         6. iat -- jwt发布时间
 *         7. jti -- jwt唯一标识,防止重复使用
 * </pre>
 *
 * @author by 李新宇
 * @date 2020-04-06 09:51
 */
@Component
public class JwtTokenUtils {

	@Autowired
	private JwtProperties jwtProperties;

	/**
	 * 获取用户名从token中
	 */
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token).getSubject();
	}

	/**
	 * 获取jwt发布时间
	 */
	public Date getIssuedAtDateFromToken(String token) {
		return getClaimFromToken(token).getIssuedAt();
	}

	/**
	 * 获取jwt失效时间
	 */
	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token).getExpiration();
	}

	/**
	 * 获取jwt接收者
	 */
	public String AudienceFromToken(String token) {
		return getClaimFromToken(token).getAudience();
	}

//	/**
//	 * 获取私有的jwt claim
//	 */
//	public String getPrivateClaimFromToken(String token, String key) {
//		return getClaimFromToken(token).get(key).getString();
//	}

//	/**
//	 * 获取md5 key从token中
//	 */
//	public String getMd5KeyFromToken(String token) {
//		return getPrivateClaimFromToken(token, jwtProperties.getMd5Key());
//	}

	/**
	 * 获取jwt的payload部分
	 */
	public Claims getClaimFromToken(String token) {
		return Jwts.parser()
				.setSigningKey(jwtProperties.getSecret())
				.parseClaimsJws(token)
				.getBody();
	}

	/**
	 * 解析token是否正确, 不正确会报异常
	 */
	public void parseToken(String token) throws JwtException {
		Jwts.parser().setSigningKey(jwtProperties.getSecret()).parseClaimsJws(token).getBody();
	}

	/**
	 * 难token是否失效
	 * true:过期  false:没过期
	 */
	public Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}

//	/**
//	 * 生成token(通过用户名和签名时用的随机数)
//	 */
//	public String generateToken(String userName,String randomKey) {
//		Map<String, Object> claims = new HashMap<String, Object>();
//		claims.put(jwtProperties.getMd5Key(), randomKey);
//		return doGenerateToken(claims, userName);
//	}
//
//	/**
//	 * 生成token
//	 */
//	private }

}