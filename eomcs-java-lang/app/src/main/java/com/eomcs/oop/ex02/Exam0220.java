package com.eomcs.oop.ex02;


// # 관련된 기능(메서드)을 묶어 분류하기
// 1) 분류 전
// 2) 메서드를 클래스로 묶어 분류하기
//
public class Exam0220 {

  // 계산 기능과 관련된 메서드를 별도의 블록으로 분리할 때 사용하는 문법이 "클래스"이다.
  // 메서드를 분류해 놓으면 좋은 점?
  // - 관련된 메서드가 한 클래스에 묶여 있기 때문에 소스 코드를 유지보수하기 쉬워진다.
  // - 다른 프로젝트에서 메서드를 재사용 하기가 쉽다.
  //
  static class Calculator {
    static int a = 2;

    static void plus(int b) {
      a += b;
    }

    static void minus(int b) {
      a -= b;
    }

    static void multiple(int b) {
      a *= b;
    }

    static void divide(int b) {
      a /= b;
    }

    static void abs(int a) {
      //
      // if (a >= 0)
      // return a;
      // else
      // return a * -1;
      //
      System.out.println(a >= 0 ? a : a * -1);
    }
  }

  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    // 계산 결과를 담을 변수를 준비한다.
    int result = 0;

    // 클래스 메서드를 호출하여 작업을 수행하고,
    // 리턴 결과는 로컬 변수에 저장한다.
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    System.out.printf("result = %d\n", Calculator.a);
    System.out.println();
    System.out.println(Calculator.a);
    Calculator.a = 100;
    System.out.println(Calculator.a);
  }
}
// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들 때
// - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
// - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.


