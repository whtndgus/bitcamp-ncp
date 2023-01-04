package bitcamp.myapp;

public class DefenseGame {
  public static int solution(int n, int k, int[] enemy) {
    int answer = k;
    int count = 1;

    for (int i = k; i < enemy.length; i++) {
      int[] tmp = cuts(enemy, i);

      if (n >= sumMin(tmp, count++)) {
        answer = i + 1;
      } else {
        break;
      }
    }

    return answer;
  }

  public static int minArray(int[] array) {
    int min = array[0];
    int idx = 0;
    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) {
        idx = i;
        min = array[i];
      }
    }
    return idx;
  }

  public static int[] cut(int[] array, int idx) {
    int[] tmps = new int[array.length - 1];
    int in = 0;
    for (int i = 0; i < array.length; i++) {
      if (i != idx) {
        tmps[in++] = array[i];
      }
    }
    return tmps;
  }

  public static int[] cuts(int[] array, int idx) {
    int[] tmps = new int[idx + 1];
    for (int i = 0; i < idx + 1; i++) {
      tmps[i] = array[i];
    }
    return tmps;
  }

  public static int sumMin(int[] array, int in) {
    int sum = 0;
    for (int i = 0; i < in; i++) {
      int idx = minArray(array);
      sum += array[idx];
      array = cut(array, idx);
    }
    return sum;
  }
}
