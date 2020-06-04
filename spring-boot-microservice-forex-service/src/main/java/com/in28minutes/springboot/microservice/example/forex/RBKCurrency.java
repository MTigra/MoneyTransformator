package com.in28minutes.springboot.microservice.example.forex;

import java.math.BigDecimal;

public class RBKCurrency {
    private float status;
    Meta MetaObject;
    Data DataObject;


    // Getter Methods

    public float getStatus() {
        return status;
    }

    public Meta getMeta() {
        return MetaObject;
    }

    public Data getData() {
        return DataObject;
    }

    // Setter Methods

    public void setStatus(float status) {
        this.status = status;
    }

    public void setMeta(Meta metaObject) {
        this.MetaObject = metaObject;
    }

    public void setData(Data dataObject) {
        this.DataObject = dataObject;
    }
}
class Data {
    private String date;
    private BigDecimal sum_result;
    private BigDecimal rate1;
    private BigDecimal rate2;


    // Getter Methods

    public String getDate() {
        return date;
    }

    public BigDecimal getSum_result() {
        return sum_result;
    }

    public BigDecimal getRate1() {
        return rate1;
    }

    public BigDecimal getRate2() {
        return rate2;
    }

    // Setter Methods

    public void setDate(String date) {
        this.date = date;
    }

    public void setSum_result(BigDecimal sum_result) {
        this.sum_result = sum_result;
    }

    public void setRate1(BigDecimal rate1) {
        this.rate1 = rate1;
    }

    public void setRate2(BigDecimal rate2) {
        this.rate2 = rate2;
    }
}
class Meta {
    private float sum_deal;
    private String source;
    private String currency_from;
    private String date = null;
    private String currency_to;


    // Getter Methods

    public float getSum_deal() {
        return sum_deal;
    }

    public String getSource() {
        return source;
    }

    public String getCurrency_from() {
        return currency_from;
    }

    public String getDate() {
        return date;
    }

    public String getCurrency_to() {
        return currency_to;
    }

    // Setter Methods

    public void setSum_deal(float sum_deal) {
        this.sum_deal = sum_deal;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setCurrency_from(String currency_from) {
        this.currency_from = currency_from;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCurrency_to(String currency_to) {
        this.currency_to = currency_to;
    }
}