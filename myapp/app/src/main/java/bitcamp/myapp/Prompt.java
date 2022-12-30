package bitcamp.myapp;

import java.util.Scanner;

public class Prompt {
  static Scanner scan = new Scanner(System.in);

  static String inputString(String str) {
    System.out.print(str + " : ");
    return scan.next();
  }

  static char inputChar(String str) {
    System.out.print(str + " : ");
    return scan.next().equals("남성") ? '남' : '여';
  }


  static int inputInt(String str) {
    System.out.print(str + " : ");
    return Integer.parseInt(scan.next());
  }

  static boolean inputBoolean(String str) {
    System.out.print(str + " : ");
    return scan.next().equals("1");
  }

  static void close() {
    scan.close();
  }
}
