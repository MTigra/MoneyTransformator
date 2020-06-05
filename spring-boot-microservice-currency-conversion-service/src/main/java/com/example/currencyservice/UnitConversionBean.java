package com.example.currencyservice;
import java.math.BigDecimal;

public class UnitConversionBean {
  private String from;
  private String to;
  private String conversionMultiple;
  private BigDecimal quantity;
  private String totalCalculatedAmount;
  private String ip;
  private int port;

  public UnitConversionBean() {

  }

  public UnitConversionBean(String from, String to, String conversionMultiple, BigDecimal quantity,
                            String totalCalculatedAmount,  String ip, int port) {
    super();
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.quantity = quantity;
    this.totalCalculatedAmount = totalCalculatedAmount;
    this.ip = ip;
    this.port = port;
  }


  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getConversionMultiple() {
    return conversionMultiple;
  }

  public void setConversionMultiple(String conversionMultiple) {
    this.conversionMultiple = conversionMultiple;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public String getTotalCalculatedAmount() {
    return totalCalculatedAmount;
  }

  public void setTotalCalculatedAmount(String totalCalculatedAmount) {
    this.totalCalculatedAmount = totalCalculatedAmount;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }
}