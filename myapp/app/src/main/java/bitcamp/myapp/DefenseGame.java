package bitcamp.myapp;

public class DefenseGame {
  public static int solution(int n, int k, int[] enemy) {
    int answer = 0;
    int count = 0;

    for (int i = 0; i < enemy.length; i++) {
      if (n > enemy[i]) {
        n -= enemy[i];
        answer = i + 1;
      } else {

        for (int ii = 0; ii < enemy.length; ii++) {
          if (k > 0) {
            int[] tmps = absolute(enemy, 1);

          } else {
            break;
          }
        }
        break;
      }
    }

    return answer;
  }

  public static int maxArray(int[] array) {
    int max = -1;
    for (int i : array) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  public static int[] absolute(int[] array, int in) {
    for (int ii = 0; ii < in; ii++) {
      int max = maxArray(array); // 배열의 최대값
      for (int i = 0; i < array.length; i++) {
        if (array[i] == max) {
          array = cut(array, i);
          break;
        }
      }
    }
    return array;
  }

  public static int[] cut(int[] array, int idx) {
    int[] tmps = new int[idx + 1];
    int in = 0;
    for (int i = 0; i < idx + 1; i++) {
      if (i != idx) {
        tmps[in++] = array[i];
      }
    }


    return tmps;
  }
}
