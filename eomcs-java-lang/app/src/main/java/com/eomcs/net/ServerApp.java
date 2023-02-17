package com.eomcs.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트와 연결댐");

    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    while (true) {
      System.out.print("클라이언트> ");
      String str1 = in.nextLine();
      System.out.println(str1);

      System.out.print("입력 : ");
      String str2 = scan.nextLine();
      out.println(str2);
      if (str2.equals("exit"))
        break;
    }
    out.close();
    in.close();
    socket.close();
    serverSocket.close();
  }

}
