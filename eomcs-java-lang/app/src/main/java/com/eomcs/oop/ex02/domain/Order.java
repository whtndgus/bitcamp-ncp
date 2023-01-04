package com.eomcs.oop.ex02.domain;

public class Order {
  String nname;
  String adrr;
  String pay;
  String product;
  int ea;
  int cupon;

  public Order(String name, String adrr, String pay, String product, int ea, int cupon) {
    this.nname = name;
    this.adrr = adrr;
    this.pay = pay;
    this.product = product;
    this.ea = ea;
    this.cupon = cupon;
  }
}
