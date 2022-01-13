package com.leng.oldass.util;

import com.leng.oldass.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;

/**
 * 签名生成工具类
 *
 * @author lengzq
 * @since 2022/1/11 21:47
 */
public class TokenUtil {

    public static final String TOKEN_HEADER = "token";
    private static final long EXPIRE_TIME = 15*60*1000;
    /**
     * 密钥盐
     */
    private static final String TOKEN_SECRET = "tokensecret";
    private static final String ISS = "lengzq";

    /**
     * 生成token
     * @param user 用户
     * @return token
     */
    public static String createToken(Object user){
        String token = null;
        try{
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("user", user);
            token = Jwts.builder()
                    //签发人
                    .setIssuer(ISS)
                    //负载
                    .setClaims(hashMap)
                    //签发时间
                    .setIssuedAt(new Date())
                    //加密
                    .signWith(SignatureAlgorithm.HS256, TOKEN_SECRET)
                    .compact();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }

    public static Claims verify(String token) {
        return Jwts.parser().setSigningKey(TOKEN_SECRET).parseClaimsJws(token).getBody();
    }
}
