package bitcamp.myapp;

public class SunYeul {

  public static void yeul(String str, String s, int in) throws InterruptedException {
    if (s.length() == in) {
      System.out.println(s);
      Thread.sleep(10);
    } else {
      for (int i = 0; i < str.length(); i++) {
        String tmp1 = s + str.substring(i, i + 1);
        String tmp2 = str.substring(0, i) + str.substring(i + 1, str.length());
        yeul(tmp2, tmp1, in);
      }
    }

  }

  public static void sun(String str) throws InterruptedException {
    for (int i = 1; i < str.length() + 1; i++) {
      yeul(str, "", i);
    }
  }
}
