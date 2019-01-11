package com.dlx.ababy.tokenVerify;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {


    @Override
    public  boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("utf-8");
        String token = request.getHeader("token");
        if (token != null && !token.equals("")) {

            boolean result = JwtVerify.verify(token);

            if (result) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
