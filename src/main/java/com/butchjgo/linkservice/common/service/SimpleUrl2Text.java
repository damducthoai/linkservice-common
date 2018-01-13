package com.butchjgo.linkservice.common.service;

import com.butchjgo.linkservice.common.utils.Util;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class SimpleUrl2Text implements Url2Text {

    @Override
    public String get(String url) {

        String res = null;

        HttpGet httpGet = new HttpGet(url);
        HttpResponse httpResponse;
        try(CloseableHttpClient httpClient = Util.getNormalHttpClient();) {
            httpResponse = httpClient.execute(httpGet);

            if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK) return null;

            res = EntityUtils.toString(httpResponse.getEntity());
            httpGet.releaseConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            return res;
        }
    }
}
