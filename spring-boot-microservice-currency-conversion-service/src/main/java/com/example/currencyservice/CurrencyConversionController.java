package com.example.currencyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@CrossOrigin
public class CurrencyConversionController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CurrencyExchangeServiceProxy currencyProxy;

    @Autowired
    private UnitExchangeServiceProxy unitProxy;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}/source/{source}")
    public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
                                                       @PathVariable BigDecimal quantity, @PathVariable String source) {

        CurrencyConversionBean response = currencyProxy.retrieveExchangeValue(from, to, source);

        logger.info("{}", response);

        return new CurrencyConversionBean(from, to, response.getConversionMultiple(), quantity,
                quantity.multiply(response.getConversionMultiple()), response.getIp(), response.getPort());
    }

    @GetMapping("unit-convert/from/{from}/to/{to}/quantity/{quantity}")
    public UnitConversionBean converUnitFeign(@PathVariable String from, @PathVariable String to,
                                              @PathVariable BigDecimal quantity) {

        UnitConversionBean response = unitProxy.retrieveExchangeValue(from, to, quantity);

        logger.info("", response);

        return new UnitConversionBean(from, to, response.getConversionMultiple(),
                quantity, response.getConversionMultiple(), response.getIp(), response.getPort());
    }

}