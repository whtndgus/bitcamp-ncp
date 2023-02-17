package bitcamp.myapp.pgms;

public class StringQA {
  public static String dD(String str) {
    int count = 1;
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i, i + 1).equals("\n")) {
        str = str.substring(0, i + 1) + pattern(" ", count) + str.substring(i + 1, str.length());
        i += count++;
      } ;
    }
    return str;
  }

  public static String spaceCut(String str) {

    for (int i = 0; i < str.length(); i++) {
      if (!str.substring(i, i + 1).equals(" ") && !str.substring(i, i + 1).equals("")) {
        str = str.substring(i, str.length());
        break;
      }
    }
    for (int i = str.length() - 1; i >= 0; i--) {
      if (!str.substring(i, i + 1).equals(" ") && !str.substring(i, i + 1).equals("")) {
        str = str.substring(0, i + 1);
        break;
      }
    }
    return str;
  }

  public static String pattern(String str, int in) {
    String tmp = "";
    for (int i = 0; i < in; i++) {
      tmp += str;
    }
    return tmp;
  }

  public static boolean anagram(String str1, String str2) {
    int len = 0;
    boolean check = true;
    len = str1.length();
    for (int i = 0; i < len; i++) {
      String s = str1.substring(i, i + 1).toUpperCase();
      if (!s.equals("") && !s.equals(" ") && str2.toUpperCase().contains(s.toUpperCase())) {
        int ix = str2.toUpperCase().indexOf(s.toUpperCase());
        str2 = str2.substring(0, ix) + "" + str2.substring(ix + 1, str2.length());
      } else if (!s.equals("") && !s.equals(" ") && !str2.toUpperCase().contains(s.toUpperCase())) {
        check = false;
        break;
      }
    }
    for (String s : str2.split(" ")) {
      if (s.length() > 0) {
        check = false;
      }
    }
    return check;
  }

  public static int strCycle(String str, String key) {
    int sum = 0;
    while (true) {
      if (str.contains(key)) {
        int idx = str.indexOf(key);
        str = str.substring(0, idx) + str.substring(idx + key.length(), str.length());
        sum++;
      } else {
        break;
      }
    }
    return sum;
  }

  public static String[] maxLength(String[] array) {
    String[] answer = new String[array.length];

    for (int i = 0; i < answer.length; i++) {
      int idx = 0;
      String max = "";
      for (int ii = 0; ii < array.length; ii++) {
        if (!array[ii].equals("empty") && array[ii].length() > max.length()) {
          max = array[ii];
          idx = ii;
        }
      }
      answer[i] = max;
      array[idx] = "empty";
    }

    return answer;
  }
}
