package bitcamp.myapp;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalClient {

  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("192.168.0.7", 8888);
    Scanner scan = new Scanner(System.in);

    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    long first = -252525626;
    String middle = null;
    long secont = -252525626;

    while (true) {
      if (first != -252525626 && middle != null && secont != -252525626) {
        System.out.printf("［%s %s %s］\n", first, middle, secont);
      } else if (first != -252525626 && middle != null) {
        System.out.printf("［%s %s ］\n", first, middle);
      } else if (first != -252525626) {
        System.out.printf("［%s］\n", first);
      } else {
        System.out.printf("［］\n");
      }

      System.out.print("계산기(r:초기화) => ");
      String ip = scan.nextLine();

      if (isInteger(ip)) {
        if (middle == null) {
          first = Long.parseLong(ip);
        } else {
          secont = Long.parseLong(ip);
          out.println(first);
          out.println(middle);
          out.println(secont);
          first = Long.parseLong(in.nextLine());
          middle = null;
          secont = -252525626;
        }
      } else if (ip.equals("r")) {
        first = -252525626;
        middle = null;
        secont = -252525626;
      } else {
        if (first != -252525626) {
          if (ip.equals("*")) {
            middle = "*";
          } else if (ip.equals("/")) {
            middle = "/";
          } else if (ip.equals("%")) {
            middle = "%";
          } else if (ip.equals("+")) {
            middle = "+";
          } else if (ip.equals("-")) {
            middle = "-";
          } else {
            System.out.println("잘못된 입력");
          }
        } else {
          System.out.println("정수 입력 필요");
        }
      }
      if (false) {
        break;
      } else {
        System.out.println("\n");
      }

    }

    out.close();
    in.close();
    socket.close();
  }

  public static boolean isInteger(String strValue) {
    try {
      Integer.parseInt(strValue);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

  public static boolean isLong(String strValue) {
    try {
      Long.parseLong(strValue);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

  public static boolean isFloat(String strValue) {
    try {
      Float.parseFloat(strValue);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

  public static boolean isDouble(String strValue) {
    try {
      Double.parseDouble(strValue);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

  public static boolean isint(double num) {
    System.out.println((long) num);
    return num % 1 == 0.0;
  }
}
