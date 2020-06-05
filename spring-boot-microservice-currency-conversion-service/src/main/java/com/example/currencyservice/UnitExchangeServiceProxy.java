package com.example.currencyservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


@FeignClient(name = "unit-service")
@RibbonClient(name = "unit-service")
public interface UnitExchangeServiceProxy {
    @GetMapping("/unit-convert/from/{from}/to/{to}")
    public UnitConversionBean retrieveExchangeValue
            (@PathVariable("from") String from, @PathVariable("to") String to,
             @RequestParam("source") BigDecimal source);

}
