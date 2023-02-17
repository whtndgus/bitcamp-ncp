package com.eomcs.oop.ex02.test;

import com.eomcs.oop.ex02.domain.Calculator2;

// # 관련된 기능(메서드)을 묶어 분류하기
// 1) 분류 전
// 2) 메서드를 클래스로 묶어 분류하기
// 3) 클래스 변수 도입
// 4) 클래스 변수의 한계 확인
// 5) 인스턴스 변수 도입
// 6) 인스턴스 메서드 활용
// 7) 패키지 멤버 클래스로 분리
// 8) 클래스를 역할에 따라 패키지로 분류하기

//
public class Calculator_Test {

  public static void main(String[] args) {
    Calculator2 cal = new Calculator2(2);

    cal.plus(3);
    cal.minus(1);
    cal.multiple(7);
    cal.divide(3);

    System.out.printf("result = %d\n", cal.result);

    Calculator2 cal1 = new Calculator2(3);
    cal1.plus(3);
    cal1.minus(1);
    cal1.multiple(7);
    cal1.divide(3);

    System.out.printf("result2 = %d\n", cal1.result);

    Calculator2 cal2 = new Calculator2(4);
    cal2.plus(3);
    cal2.minus(1);
    cal2.multiple(7);
    cal2.divide(3);

    System.out.printf("result3 = %d\n", cal2.result);
    System.out.println(Calculator2.abs(-3510));
  }

  static int plus(int a, int b) {
    return a + b;
  }

  static int minus(int a, int b) {
    return a - b;
  }

  static int multiple(int a, int b) {
    return a * b;
  }

  static int divide(int a, int b) {
    return a / b;
  }

}
