package bitcamp.myapp.pgms;

import java.util.ArrayList;

public class theyPicture_CP {
  public static int solution(int n, String[] data) {
    int answer = 0;
    ArrayList<String> strs = new ArrayList<>();
    yeul("ACFJMNRT", "", 8, strs);

    String first;
    String second;
    String mn;
    int mm;
    boolean check;


    for (int a = 0; a < strs.size(); a++) {
      check = true;
      for (int i = 0; i < data.length; i++) {
        mn = data[i].substring(3, 4);
        mm = Integer.parseInt(data[i].substring(4, 5));
        first = data[i].substring(0, 1);
        second = data[i].substring(2, 3);
        if (!checkStr(strs.get(a), first, second, mm, mn)) {
          check = false;
          break;
        }
      }
      if (check) {
        answer++;
      }
    }

    return answer;
  }

  public static boolean checkStr(String strs, String str1, String str2, int in, String mn) {
    int tmp = Math.abs(strs.indexOf(str1) - strs.indexOf(str2));
    if (mn.equals("=")) {
      return tmp == (in + 1);
    } else if (mn.equals(">")) {
      return tmp > (in + 1);
    } else if (mn.equals("<")) {
      return tmp < (in + 1);
    }



    return false;
  }

  public static void yeul(String str, String s, int in, ArrayList<String> st) {
    if (s.length() == in) {
      st.add(s);
    } else {
      for (int i = 0; i < str.length(); i++) {
        String tmp1 = s + str.substring(i, i + 1);
        String tmp2 = str.substring(0, i) + str.substring(i + 1, str.length());
        yeul(tmp2, tmp1, in, st);
      }
    }
  }
}
