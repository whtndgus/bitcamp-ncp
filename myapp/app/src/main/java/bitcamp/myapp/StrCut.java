package bitcamp.myapp;

public class StrCut {
  public static String strCut(String str) {
    for (int i = 0; i < str.length() - 1; i++) {
      String tmp = str.substring(i + 1, str.length());

      while (tmp.contains(str.substring(i, i + 1))) {
        int idx = tmp.indexOf(str.substring(i, i + 1));
        str =
            str.substring(0, i + 1) + tmp.substring(0, idx) + tmp.substring(idx + 1, tmp.length());
        tmp = tmp.substring(0, idx) + tmp.substring(idx + 1, tmp.length());
      }
    }


    return str;
  }
}
