package dio.jwt_web_security.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.util.List;

public class JWTCreator {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(String prefix, String key, JWTObject jwtObject) {
        String token = String.valueOf(Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .setExpiration(jwtObject.getExpiration())
                .setIssuedAt(jwtObject.getIssuedAt())
                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles()))
                .signWith(SignatureAlgorithm.HS512, key).compact());
        System.out.println(String.format("%s %s", prefix, token));
        return String.format("%s %s", prefix, token);
    }

    public static JWTObject create(String token, String prefix, String key)
            throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException {
        var obj = new JWTObject();
        token = token.replace(prefix, "");
        var codedKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(key));
        var claims = Jwts.parser() // 🔴 Se estiver deprecated, use "parserBuilder()"
                .verifyWith(codedKey)
                .build()
                .parseSignedClaims(token)
                .getPayload();
        obj.setSubject(claims.getSubject());
        obj.setExpiration(claims.getExpiration());
        obj.setIssuedAt(claims.getIssuedAt());
        obj.setRoles((List<String>) claims.get(ROLES_AUTHORITIES));
        return obj;
    }

    private static List<String> checkRoles(List<String> roles) {
        return roles.stream().map(s -> "ROLE_" + s.replaceAll("ROLE_", "")).toList();
    }
}
