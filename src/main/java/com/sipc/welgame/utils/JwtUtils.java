package com.sipc.welgame.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.sipc.welgame.pojo.domain.UserInfo;
import com.sipc.welgame.pojo.model.TokenModel;

import java.util.Date;

public class JwtUtils {
    public static final long EXPIRE_TIME = (long) 1000 * 60 * 60 * 24 * 15;
    public static final String SECRET = "SIPC115";

    public static String sign(UserInfo userInfo) {
        Date expireDate = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        return JWT.create()
                .withClaim("studentId",userInfo.getStudentId())
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(SECRET));
    }

    public static boolean verify(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT decodedJWT = verifier.verify(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static TokenModel getTokenModelByToken(String token) {
        DecodedJWT decodedJWT = JWT.decode(token);
        TokenModel tokenModel = new TokenModel();
        tokenModel.setStudentId(decodedJWT.getClaim("studentId").asInt());
        return tokenModel;
    }

}
