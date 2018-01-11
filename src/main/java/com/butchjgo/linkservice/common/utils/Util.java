package com.butchjgo.linkservice.common.utils;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Util {
    private static int timeout = 3;
    public static CloseableHttpClient getHttpClient(CookieStore cookieStore){

        RequestConfig config = RequestConfig.custom().
                setConnectTimeout(timeout * 1000).
                setConnectionRequestTimeout(timeout * 1000).
                setSocketTimeout(timeout * 1000).build();
        Header header = new BasicHeader(
                HttpHeaders.CONTENT_TYPE, "application/json");
        Header userAgent = new BasicHeader(HttpHeaders.USER_AGENT,"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36");

        List<Header> headers = Arrays.asList(header, userAgent);


        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(config).setDefaultHeaders(headers).setDefaultCookieStore(cookieStore).build();
        return httpClient;
    }

    public static CloseableHttpClient getHttpClient(List<Cookie> cookies){

        final BasicCookieStore cookieStore = new BasicCookieStore();
        cookies.forEach(cookie -> cookieStore.addCookie(cookie));

        RequestConfig config = RequestConfig.custom().
                setConnectTimeout(timeout * 1000).
                setConnectionRequestTimeout(timeout * 1000).
                setSocketTimeout(timeout * 1000).build();
        Header header = new BasicHeader(
                HttpHeaders.CONTENT_TYPE, "application/json");
        Header userAgent = new BasicHeader(HttpHeaders.USER_AGENT,"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36");

        List<Header> headers = Arrays.asList(header, userAgent);


        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(config).setDefaultHeaders(headers).setDefaultCookieStore(cookieStore).build();
        return httpClient;
    }
    public static CloseableHttpClient getAccountClient(String token) {
        RequestConfig config = RequestConfig.custom().
                setConnectTimeout(timeout * 1000).
                setConnectionRequestTimeout(timeout * 1000).
                setSocketTimeout(timeout * 1000).build();
        Header header = new BasicHeader("token", token);

        CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).setDefaultHeaders(new LinkedList<Header>() {{
            add(header);
        }}).build();
        return httpClient;
    }

    public static String prepareFshareLoginData(String apiKey, String account, String password) {
        return String.format("{\"app_key\":\"%s\",\"user_email\":\"%s\",\"password\":\"%s\"}",apiKey,account,password);
    }

    public static String prepareFshareRequestData(String url, String password, String token) {
        return String.format("{\"url\":\"%s\",\"password\":\"%s\",\"token\":\"%s\"}", url, password, token);
    }
}
