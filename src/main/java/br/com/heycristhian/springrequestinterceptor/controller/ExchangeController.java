package br.com.heycristhian.springrequestinterceptor.controller;

import br.com.heycristhian.springrequestinterceptor.dto.ExchangeResponse;
import br.com.heycristhian.springrequestinterceptor.service.ExchangeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/exchanges")
public class ExchangeController {

    private final ExchangeService exchangeService;

    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping
    public ResponseEntity<ExchangeResponse> getExchange(@RequestParam String to,
                                                        @RequestParam String from,
                                                        @RequestParam BigDecimal amount) {
        var response = exchangeService.getExchange(to, from, amount);
        return ResponseEntity.ok(response);
    }
}
