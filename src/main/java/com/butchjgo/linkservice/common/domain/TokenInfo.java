package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.http.cookie.Cookie;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TokenInfo {

    private String token;
    private List<Cookie> cookies;

    public TokenInfo(String token, List<Cookie> cookies) {
        this.token = token;
        this.cookies = cookies;
    }
}
