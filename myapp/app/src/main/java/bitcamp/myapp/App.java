package bitcamp.myapp;



public class App {

  public static void main(String[] args) {
    String[] s1 = {"a", "b", "c", "d", "e", "f"};
    String[] s2 = {"a b", 
                   "a e", 
                   "b c", 
                   "f e", 
                   "e c", 
                   "e b", 
                   "c d",
                   "c a",
                   "e a"};
    for (int i : chatReport_PMS_12_30.solution(s1, s2, 2)) {
      System.out.print(i + " ");
    }
  }

}
