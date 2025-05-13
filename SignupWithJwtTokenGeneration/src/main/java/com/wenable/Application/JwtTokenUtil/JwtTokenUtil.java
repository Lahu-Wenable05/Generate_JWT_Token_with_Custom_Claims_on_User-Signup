package com.wenable.Application.JwtTokenUtil;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenUtil {

	@Value("${jwt.secret}")
	private String secretkey;

	@Value("${jwt.expirstion}")
	private long jwtExpiration;

	public String generateToken(String username) {
		Date now = new Date();
		Date expiryDate = new Date(now.getTime() + jwtExpiration);
		String encodedUserName = Base64.getEncoder().encodeToString(username.getBytes());

		Key key = Keys.hmacShaKeyFor(secretkey.getBytes());

		return Jwts.builder().setSubject(encodedUserName).setIssuedAt(now).setExpiration(expiryDate)
				.claim("userName", encodedUserName).signWith(key, SignatureAlgorithm.HS256).compact();
	}

}
