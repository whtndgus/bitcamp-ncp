package com.eomcs.oop.ex02.domain;

public class Score {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;;
    this.computer();
  }

  public void computer() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = (float) this.sum / 3;
  }

  public void printScore() {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", this.name, this.kor, this.eng, this.math,
        this.sum, this.aver);
  }
}
