package bitcamp.myapp;

public class App {

  public static void main(String[] args) throws InterruptedException {
    int[] ins = new int[0];
    System.out.println(ins.length);
    int[] in1 = {14, 35, 119};
    int[] in2 = {18, 30, 102};
    System.out.println(CountGame.solution(in1, in2));
  }

}
