package bitcamp.myapp.pgms;

public class SilverMoon {
  public static boolean silverMoon(String str) {
    if (str.length() == 1) {
      return true;
    }
    boolean check = true;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        check = false;
        break;
      } ;
    }

    return check;
  }
}
