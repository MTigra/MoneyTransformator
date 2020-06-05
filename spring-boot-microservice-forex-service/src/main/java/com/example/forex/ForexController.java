package com.example.forex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ForexController {
  
  @Autowired
  private Environment environment;

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue
    (@PathVariable String from, @PathVariable String to, @RequestParam("source") String source) throws UnknownHostException {

    Map<String, String> uriVariables = new HashMap<>();
    uriVariables.put("currency_from", from);
    uriVariables.put("currency_to", to);
    uriVariables.put("source", source);
    uriVariables.put("sum", "1");

    ResponseEntity<RBKCurrency> responseEntity;
    responseEntity = new RestTemplate().getForEntity(
            "https://cash.rbc.ru/cash/json/converter_currency_rate?currency_from={currency_from}&currency_to={currency_to}&source={source}&sum={sum}", RBKCurrency.class, uriVariables );

    RBKCurrency response = responseEntity.getBody();

    ExchangeValue exchangeValue = new ExchangeValue(from,to,response.getData().getRate1());

    exchangeValue.setIp(InetAddress.getLocalHost().getHostAddress());
    exchangeValue.setPort(
        Integer.parseInt(environment.getProperty("local.server.port")));
    
    return exchangeValue;
  }
}