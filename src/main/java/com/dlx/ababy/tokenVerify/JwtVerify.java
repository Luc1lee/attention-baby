package com.dlx.ababy.tokenVerify;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;

public class JwtVerify {

    private static final long EXPIRE_TIME = 15 * 60 * 1000;

    public static String sign(String tel, String id) {
        try {

            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            HashMap<String, Object> header = new HashMap<>(1);
            header.put("typ","JWT");
            return JWT.create().withHeader(header).withClaim("loginTel", tel).withClaim("userId", id).withExpiresAt(date).toString();
        } catch (Exception e) {
            return null;
        }
    }

}
