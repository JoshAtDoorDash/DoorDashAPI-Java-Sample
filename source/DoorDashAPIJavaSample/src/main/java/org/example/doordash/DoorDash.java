package org.example.doordash;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DoorDash {
    public static void main(String[] args) {
        java.util.HashMap<String, Object> claims = new java.util.HashMap<>();

        claims.put("aud", "doordash");
        claims.put("iss", "UPDATE_WITH_DEVELOPER_ID"); // TODO: Update value with Developer ID
        claims.put("kid", "UPDATE_WITH_KEY_ID"); // TODO: Update value with Key ID

        // Signing Secret is Base64Encoded when generated on the Credentials page, need to decode to use
        byte[] keyBytes = Decoders.BASE64URL.decode("UPDATE_WITH_SIGNING_SECRET"); // TODO: Update value with Signing Secret

        // Set JWT expiry for 30 minutes from current time
        claims.put("exp", ZonedDateTime.now(ZoneOffset.UTC).plusMinutes(30).toEpochSecond());
        claims.put("iat", ZonedDateTime.now(ZoneOffset.UTC).toEpochSecond());

        Key key = Keys.hmacShaKeyFor(keyBytes);

        // Create JWT
        String jwt = Jwts.builder()
                .setHeaderParam("dd-ver", "DD-JWT-V1")
                .setHeaderParam("typ", "JWT")
                .setClaims(claims)
                .signWith(key)
                .compact();

        // Write the DoorDash API JWT
        System.out.println("DoorDash API JWT: " + jwt);
    }
}
