package bitcamp.myapp;


public class DefenseGame_2 {
  public static int solution(int n, int k, int[] enemy) {
    int answer = 0;
    int count = 1;

    if (k >= enemy.length) {
      return enemy.length;
    }

    for (int i = k; i < enemy.length; i++) {
      if (n >= sumMin(enemy, i, count++)) {
        answer = i + 1;
      } else {
        break;
      }
    }

    return answer;
  }

  public static int sumMin(int[] array, int idx, int in) {
    int sum = 0;

    String all = "";

    for (int i = 0; i < in; i++) {
      int min = array[0];
      int minid = 0;

      for (int ii = 0; ii < idx + 1; ii++) {
        if (min >= array[ii] && !all.contains(ii + "")) {
          min = array[ii];
          minid = ii;
        }
      }
      all += (minid + "");
      sum += array[minid];

      min = array[0];
      minid = 0;
    }
    return sum;
  }
}
