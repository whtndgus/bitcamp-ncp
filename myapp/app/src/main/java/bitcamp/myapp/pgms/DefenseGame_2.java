package bitcamp.myapp.pgms;


public class DefenseGame_2 {
  public static int solution(int n, int k, int[] enemy) {
    int answer = 0;
    int count = 1;

    if (k >= enemy.length) {
      return enemy.length;
    }
    if (n == 0) {
      return k;
    }
    for (int i = k; i < enemy.length; i++) {
      if (n >= sumMin(enemy, i, count)) {
        count++;
        answer = i + 1;
      } else {
        break;
      }
    }

    return answer;
  }

  public static int sumMin(int[] array, int idx, int in) {
    int sum = 0;
    int[] tmp = array.clone();

    for (int i = 0; i < in; i++) {
      if (i > idx) {
        return sum;
      }
      int min = 1000001;
      int ix = 0;
      for (int ii = 0; ii < idx + 1; ii++) {
        if (tmp[ii] < min && tmp[ii] > 0) {
          min = tmp[ii];
          ix = ii;
        }
      }
      tmp[ix] = 0;
      sum += min;
    }
    return sum;
  }
}
