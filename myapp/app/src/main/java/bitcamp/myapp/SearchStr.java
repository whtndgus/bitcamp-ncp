package bitcamp.myapp;

public class SearchStr {
  public static String searchStr(String str) {

    String all = StrCut.strCut(str);
    int[] idx = new int[all.length()];
    for (int i = 0; i < str.length(); i++) {
      String tmp = str.substring(i, i + 1);
      ++idx[all.indexOf(tmp)];
    }
    for (int i = 0; i < idx.length; i++) {
      if (i > 0 && idx[i] != idx[i - 1]) {
        return all.substring(maxIndex(idx), maxIndex(idx) + 1);
      }
    }
    return "<>";
  }

  public static int sumArr(int[] ins) {
    int sum = 0;
    for (int i : ins) {
      sum += i;
    }
    return sum;
  }

  public static int maxIndex(int[] array) {
    int max = -1;
    int idx = -1;
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
        idx = i;
      }
    }
    return idx;
  }
}
