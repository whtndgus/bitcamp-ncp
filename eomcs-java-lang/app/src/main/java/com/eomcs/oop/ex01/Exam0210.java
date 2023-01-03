package com.eomcs.oop.ex01;

// # 레퍼런스 배열 - 사용 전
//
public class Exam0210 {
  // public static void setScore(Score s, int in) {
  // s.name = "이름";
  // s.kor = in;
  // s.eng = in;
  // s.math = in;
  // s.sum = s.eng + s.kor + s.math;
  // s.aver = s.sum / 3;
  // }



  public static void main(String[] args) {
    class Score {

      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;

      public Score() {
        this.name = "이름";
        this.kor = 10;
        this.eng = 10;
        this.math = 10;
        this.sum = this.eng + this.kor + this.math;
        this.aver = sum / 3;
      }

      public float getAver() {
        return aver;
      }

      public int getKor() {
        return kor;
      }

      public int getEng() {
        return eng;
      }

      public int getMath() {
        return math;
      }

      public String getName() {
        return name;
      }

      public int getSum() {
        return sum;
      }
    }
    // 여러 개의 인스턴스 주소 저장하기

    // 1) 성적 정보를 저장할 메모리를 설계한다.
    // class Score {
    // String name;
    // int kor;
    // int eng;
    // int math;
    // int sum;
    // float aver;
    // }

    // 2) 메모리 주소를 저장할 레퍼런스를 준비한다.
    Score s1, s2, s3;

    // 3) 설계도에 따라 메모리를 준비하고 그 주소를 각 레퍼런스에 저장한다.
    s1 = new Score();
    s2 = new Score();
    s3 = new Score();

    // 4) 각각의 레퍼런스를 통해 인스턴스에 접근하여 특정 항목에 값을 넣는다.
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3f;

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = s2.sum / 3f;

    s3.name = "유관순";
    s3.kor = 100;
    s3.eng = 100;
    s3.math = 100;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.aver = s3.sum / 3f;

    // 5) 각각의 레퍼런스를 통해 인스턴스에 접근하여 특정 항목의 값을 꺼낸다.
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum,
        s1.aver);
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum,
        s2.aver);
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s3.name, s3.kor, s3.eng, s3.math, s3.sum,
        s3.aver);

    Score[] scores = new Score[1];
    scores[0] = new Score();
    System.out.println(scores[0].name);

  }
}

// 수 십 개의 인스턴스를 저장한다면
// 레퍼런스도 그 개수에 맞춰 선언해야 한다.
// 코딩하기가 매우 불편하다.
// 만약 수 백 개라면 더더욱 불편할 것이다.
// 해결책?
// - 레퍼런스를 배열로 만드는 것이다.
//
