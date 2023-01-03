package bitcamp.myapp;

public class App {

  public static void main(String[] args) throws InterruptedException {
    int n = 17;
    int k = 3;
    int[] ins = {4, 2, 4, 5, 3, 3, 1, 3, 6, 5, 8, 9};
    System.out.println(DefenseGame.cut(ins, 0));
    BowCup2_CP.prin(DefenseGame.cut(ins, 4));

  }
}
