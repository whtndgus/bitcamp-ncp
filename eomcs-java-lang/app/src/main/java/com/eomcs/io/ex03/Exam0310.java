// Character Stream - 문자 배열의 특정 부분을 출력하기
package com.eomcs.io.ex03;

import java.io.FileReader;
import java.io.FileWriter;

public class Exam0310 {

  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("temp/test2.txt");

    char[] chars = new char[] {'A', 'B', 'C', '가', '각', '간', '똘', '똥'};
    String str1 = "ㄱㄴ";
    String str2 = "ㄷㄹ";
    String str3 = "ㅁㅂㅅ";
    out.write(str1 + "\n"); // 2번 문자부터 3 개의 문자를 출력한다.
    out.write(str2 + "\n"); // 2번 문자부터 3 개의 문자를 출력한다.
    out.write(str3 + "\n"); // 2번 문자부터 3 개의 문자를 출력한다.

    out.close();

    System.out.println("데이터 출력 완료!");
    // BufferedReader in = new BufferedReader(new FileReader("temp/test2.txt"));
    FileReader in = new FileReader("temp/test2.txt");

    new Thread(() -> {
      System.out.println("Welcome Heejin blog");
    }).start();

  }

}
