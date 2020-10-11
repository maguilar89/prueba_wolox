package com.wolox.prueba.domain.util;

import lombok.RequiredArgsConstructor;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExtraService {

    private final HttpClientBuilder httpClientBuilder;
    private static final String URL_SERVICES = "https://jsonplaceholder.typicode.com/users";
    private final MappingJackson2HttpMessageConverter springMvcJacksonConverter;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void getPosition() {

        try {
            CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
            RequestBuilder requestBuilder = RequestBuilder.get().addHeader("Accept", "application/json").setUri(URL_SERVICES);
            CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(requestBuilder.build());

            String result = EntityUtils.toString(closeableHttpResponse.getEntity());


        } catch (Exception e) {

        }
    }


}
