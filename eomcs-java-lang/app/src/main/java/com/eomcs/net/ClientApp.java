package com.eomcs.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("192.168.0.7", 8888);
    Scanner scan = new Scanner(System.in);

    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    while (true) {
      System.out.print("입력 : ");
      String str2 = scan.nextLine();
      out.println(str2);

      System.out.print("서버> ");
      String str1 = in.nextLine();
      System.out.println(str1);
      if (str2.equals("exit"))
        break;
    }
    out.close();
    in.close();
    socket.close();
  }
}
