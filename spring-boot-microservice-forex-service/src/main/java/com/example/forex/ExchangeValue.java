package com.example.forex;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;


public class ExchangeValue {

    // @Id
    // private Long id;

    //@Column(name = "currency_from")
    private String from;

   // @Column(name = "currency_to")
    private String to;

    private BigDecimal conversionMultiple;
    private String source;
    private int port;
    private String ip;

    public ExchangeValue() {

    }


    public ExchangeValue(String from, String to, BigDecimal conversionMultiple) {
        super();
        //this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    //public Long getId() {
    //  return id;
    //}

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource(){
      return source;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}