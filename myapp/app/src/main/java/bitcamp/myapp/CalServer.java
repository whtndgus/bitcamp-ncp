package bitcamp.myapp;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalServer {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    System.out.println(123123);
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    while (true) {
      long first = Long.parseLong(in.nextLine());
      String middle = in.nextLine();
      long second = Long.parseLong(in.nextLine());
      long answer = -252525626;

      if (middle.equals("*")) {
        answer = first * second;
      } else if (middle.equals("/")) {
        answer = first / second;
      } else if (middle.equals("%")) {
        answer = first % second;
      } else if (middle.equals("+")) {
        answer = first + second;
      } else if (middle.equals("-")) {
        answer = first - second;
      }
      System.out.printf("결과값 => %s\n", answer);
      out.println(answer);
      if (false) {
        break;
      }
    }

    out.close();
    in.close();
    socket.close();
    serverSocket.close();
  }

}
