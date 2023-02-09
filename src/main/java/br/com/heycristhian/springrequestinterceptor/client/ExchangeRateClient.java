package br.com.heycristhian.springrequestinterceptor.client;

import br.com.heycristhian.springrequestinterceptor.dto.ExchangeResponse;
import br.com.heycristhian.springrequestinterceptor.interceptor.ExchangeRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "exchange-client", url = "${exchange.api.url}", configuration = ExchangeRequestInterceptor.class)
public interface ExchangeRateClient {

    @GetMapping("/convert")
    ResponseEntity<ExchangeResponse> exchange(@RequestParam String to,
                                              @RequestParam String from,
                                              @RequestParam BigDecimal amount);
}
