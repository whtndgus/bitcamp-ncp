package com.eomcs.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp2 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("192.168.0.7", 8888);
    Scanner scan = new Scanner(System.in);

    DataInputStream in = new DataInputStream(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

    File file = new File("photo.jpg");
    out.writeUTF("phto21.jpg");
    out.writeLong(file.length());

    // 파일을 1바이트씩 읽어어 전송 한다.
    FileInputStream fileIn = new FileInputStream(file);
    int b;
    while ((b = fileIn.read()) != -1) {
      out.write(b);
    }

    fileIn.close();

    System.out.println(in.readUTF());

    out.close();
    in.close();
    socket.close();
  }
}
