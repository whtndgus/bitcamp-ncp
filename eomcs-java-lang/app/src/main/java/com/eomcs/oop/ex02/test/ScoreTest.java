package com.eomcs.oop.ex02.test;

import com.eomcs.oop.ex02.domain.Score;

// 0) 낱개 변수 사용
// 1) 성적 데이터를 저장할 사용자 정의 데이터 타입을 만든다.
// 2) 리팩토링: 메서드 추출(extract method), static nested class
// 3) 리팩토링: 메서드 추출(extract method) = 한 개의 메서드는 한 개의 기능을 수행해야 한다.
// 4) GRASP(General Responsibility Assignment Software Patterns) 패턴
// 5) 인스턴스 메서드: 인스턴스 주소를 받는 더 쉬운 문법
// 6) 패키지 멤버 클래스:
// 7) 클래스를 역할에 따라 패키지로 분류
// 8) 생성자 도입: 인스턴스를 생성할 때 값을 초기화시키는 특별한 메서드
//

public class ScoreTest {
  static class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    class Score1 {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    Score1 s1 = new Score1();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 85;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = (float) s1.sum / 3;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum,
        s1.aver);

    Score2 s2 = new Score2();
    s2.name = "홍길동";
    s2.kor = 100;
    s2.eng = 90;
    s2.math = 85;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = (float) s2.sum / 3;
    printScore(s2);

    Score2 s3 = new Score2();
    s3.name = "홍길동";
    s3.kor = 100;
    s3.eng = 90;
    s3.math = 85;
    computer(s3);
    printScore(s2);

    Score s4 = new Score("홍길동", 100, 90, 85);
    s4.printScore();
  }

  public static void computer(Score2 s2) {
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = (float) s2.sum / 3;
  }

  public static void printScore(Score2 s1) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum,
        s1.aver);
  }
}
