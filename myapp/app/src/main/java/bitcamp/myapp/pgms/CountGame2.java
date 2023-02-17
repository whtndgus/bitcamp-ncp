package bitcamp.myapp.pgms;

public class CountGame2 {
  public static int solution(int[] arrayA, int[] arrayB) {
    int answer = 0;

    int maxa = gg(arrayA);
    int maxb = gg(arrayB);
    for (int i = 0; i < arrayB.length; i++) {
      if (maxa == 0 || arrayB[i] % maxa == 0) {
        maxa = 0;
        break;
      }
    }
    for (int i = 0; i < arrayA.length; i++) {
      if (maxb == 0 || arrayA[i] % maxb == 0) {
        maxb = 0;
        break;
      }
    }
    if (maxa + maxb == 0) {
      return 0;
    }

    if (maxa > maxb) {
      answer = maxa;
    } else {
      answer = maxb;
    }
    return answer;
  }

  public static String yacSu(int in) {
    String all = " ";
    for (int i = 2; i * 2 <= in; i++) {
      if (in % i == 0)
        all += i + " ";
    }

    all += in + " ";

    return all;
  }

  public static String gongYacSu(String array1, String array2) {
    String all = " ";
    String[] strs = array1.split(" ");

    for (String s : strs) {
      if (array2.contains(" " + s + " ") && !s.equals(""))
        all += s + " ";
    }

    return all;
  }

  public static int gg(int[] ins) {
    int max = ins[ins.length - 1];
    int result = 0;
    for (int i = max / 2; i > 1; i--) {
      boolean check = false;
      for (int ii = 0; ii < ins.length; ii++) {
        if (ins[ii] % i == 0) {
          check = true;
        } else {
          check = false;
          break;
        }
      }
      if (check) {
        result = i;
        break;
      }
    }

    return result;
  }

  public static String notGongYacSu(String array1, String array2) {
    String all = " ";
    String[] strs = array1.split(" ");

    for (String s : strs) {
      if (!array2.contains(" " + s + " ") && !s.equals(""))
        all += s + " ";
    }
    return all;
  }

  public static int maxInt(String array) {
    int max = 0;
    String[] strs = array.split(" ");
    if (strs.length > 0) {
      max = Integer.parseInt(strs[strs.length - 1]);
    } else {
      max = 0;
    }
    return max;
  }
}
