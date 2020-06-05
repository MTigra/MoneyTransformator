package com.example.unitconversion;

import java.math.BigDecimal;


public class ExchangeValue {

    // @Id
    // private Long id;

    //@Column(name = "currency_from")
    private String from;

   // @Column(name = "currency_to")
    private String to;

    private String conversionMultiple;
    private String source;
    private int port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private String ip;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionMultiple(String conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public ExchangeValue() {

    }


    public ExchangeValue(String from, String to, String conversionMultiple) {
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

    public String getConversionMultiple() {
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


}