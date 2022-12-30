package bitcamp.myapp;

/* n진수 게임 [ https://school.programmers.co.kr/learn/courses/30/lessons/17687 ] */
public class nCountGame_PMS_12_30 {
  public static String solution(int n, int t, int m, int p) {
    char[] strs = new char[t * m];
    String user = "";
    int count = 0;
    for (int i = 0; i < 1000; i++) {
      if (strs[t * m - 1] != 0) {
        break;
      }
      for (int ii = 0; ii < Integer.toString(i, n).length(); ii++) {
        if (strs[t * m - 1] != 0) {
          break;
        }
        strs[count++] = Integer.toString(i, n).charAt(ii);
      }
    }
    int cnt = 1;
    for (int i = 0; i < strs.length; i++) {
      if (p == cnt) {
        user += strs[i];
      }
      if (cnt == m) {
        cnt = 1;
      } else {
        cnt++;
      }
    }
    return user.toUpperCase();
  }
}
