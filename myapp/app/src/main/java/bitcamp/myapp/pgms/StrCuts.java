package bitcamp.myapp.pgms;

public class StrCuts {
  public static String strCuts(String str, String cut) {
    String[] strs = str.split(cut);
    String result = "";
    for (String s : strs) {
      result += s;
    }
    return result;
  }
}
