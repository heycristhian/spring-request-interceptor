package br.com.heycristhian.springrequestinterceptor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoResponse {
    private int timestamp;
    private BigDecimal rate;
}
