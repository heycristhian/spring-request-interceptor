package br.com.heycristhian.springrequestinterceptor.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;

public class ExchangeRequestInterceptor implements RequestInterceptor {

    @Value("${exchange.api.apikey}")
    private String apiKey;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("apikey", apiKey);
    }
}
