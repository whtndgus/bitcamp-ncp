package com.eomcs.oop.ex02.domain;

public class Books {
  String name;
  int pages;
  int pay;

  public Books(String name, int pages, int pay) {
    this.name = name;
    this.pages = pages;
    this.pay = pay;
  }

  public void soGe() {
    System.out.printf("책 이름 : %s\n책 가격 : %d", this.name, this.pay);
  }
}
