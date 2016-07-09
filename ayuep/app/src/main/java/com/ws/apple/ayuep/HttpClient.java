package com.ws.apple.ayuep;

import com.loopj.android.http.AsyncHttpClient;

/**
 * Created by apple on 16/7/9.
 */

public class HttpClient extends AsyncHttpClient {

    public HttpClient()
    {
        super();
    }

    public static HttpClient getInstance()
    {
        HttpClient client = new HttpClient();
        client.setProxy("http://192.168.0.103", 8090);
        client.addHeader(HEADER_CONTENT_TYPE, "application/json");
        client.addHeader("Accept", "application/json");
        client.setURLEncodingEnabled(false);
        return client;
    }
}
