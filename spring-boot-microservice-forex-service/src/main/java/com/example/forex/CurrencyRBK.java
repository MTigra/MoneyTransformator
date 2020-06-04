//package com.in28minutes.springboot.microservice.example.forex;
//
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(name="rbk-service")
//public interface CurrencyRBK {
//  @GetMapping("https://cash.rbc.ru/cash/json/converter_currency_rate/")
//  public ExchangeValue retrieveExchangeValue
//    (@RequestParam("currency_from") String from, @RequestParam("currency_to") String to);
//}