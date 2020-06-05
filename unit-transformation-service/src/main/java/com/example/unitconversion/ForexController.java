package com.example.unitconversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ForexController {

    @Autowired
    private Environment environment;

    @GetMapping("/unit-convert/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to, @RequestParam("source") BigDecimal source) throws UnknownHostException {

        ExchangeValue exchangeValue = new ExchangeValue(from, to, UnitConverter.convert(from, to, source));

        exchangeValue.setPort(
                Integer.parseInt(environment.getProperty("local.server.port")));

        exchangeValue.setInfo(
                "environment.getProperty(\"server.port\"); ->" + environment.getProperty("server.port") + "\n" +
                        "InetAddress.getLocalHost().getHostAddress(); ->" + InetAddress.getLocalHost().getHostAddress() + "\n" +
                        "InetAddress.getLocalHost().getHostName(); ->" + InetAddress.getLocalHost().getHostName() + "\n" +
                        "InetAddress.getLoopbackAddress().getHostAddress(); ->" + InetAddress.getLoopbackAddress().getHostAddress() + "\n" +
                        "InetAddress.getLoopbackAddress().getHostName(); ->" + InetAddress.getLoopbackAddress().getHostName() + "\n"
        );

        return exchangeValue;
    }
}