package com.eomcs.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp2 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    ServerSocket serverSocket = new ServerSocket(8888);

    Socket socket = serverSocket.accept();
    System.out.println("클라이언트와 연결댐");

    DataInputStream in = new DataInputStream(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

    String name = in.readUTF();

    // 클라이언트가 보낸 파일의 크기를 미리 읽는다
    long length = in.readLong();
    FileOutputStream file = new FileOutputStream(name);
    for (int i = 0; i < length; i++) {
      file.write(in.read());
    }

    out.writeUTF("완료");

    out.close();
    in.close();
    socket.close();
    serverSocket.close();
  }

}
