package br.com.heycristhian.springrequestinterceptor.service;

import br.com.heycristhian.springrequestinterceptor.client.ExchangeRateClient;
import br.com.heycristhian.springrequestinterceptor.dto.ExchangeResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExchangeService {

    private final ExchangeRateClient exchangeRateClient;

    public ExchangeService(ExchangeRateClient exchangeRateClient) {
        this.exchangeRateClient = exchangeRateClient;
    }

    public ExchangeResponse getExchange(String to, String from, BigDecimal amount) {
        return exchangeRateClient.exchange(to, from, amount).getBody();
    }
}
