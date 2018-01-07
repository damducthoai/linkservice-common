package com.butchjgo.linkservice.common.domain;

import org.apache.http.cookie.Cookie;

import java.util.List;

public class TokenInfo {

    private String token;
    private List<Cookie> cookies;

    public TokenInfo() {
    }

    public TokenInfo(String token, List<Cookie> cookies) {
        this.token = token;
        this.cookies = cookies;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(List<Cookie> cookies) {
        this.cookies = cookies;
    }
}
