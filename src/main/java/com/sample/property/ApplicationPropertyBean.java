package com.sample.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationPropertyBean {

    @Value("${test.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
