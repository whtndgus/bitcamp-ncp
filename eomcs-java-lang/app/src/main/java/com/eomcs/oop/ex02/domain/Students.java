package com.eomcs.oop.ex02.domain;

public class Students {
  String name;
  String pon;
  boolean jejic;

  public Students(String name, String pon, boolean jejic) {
    this.name = name;
    this.pon = pon;
    this.jejic = jejic;
  }

  public void printStu() {
    System.out.println("이름: \n전화 번호 : \n재직 여부 : ");
  }
}
