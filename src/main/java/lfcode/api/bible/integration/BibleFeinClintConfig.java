package lfcode.api.bible.integration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class BibleFeinClintConfig {

    @Value("${bible.api.secretKey}")
    private String secretKey;

    @Bean
    public RequestInterceptor bearerTokenRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                template.header("Authorization", String.format("Bearer %s", secretKey));
            }
        };
    }
}
