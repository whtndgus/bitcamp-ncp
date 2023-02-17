package bitcamp.myapp.pgms;

public class QueeSum {
  public static int solution(int[] queue1, int[] queue2) {
    int answer = 0;
    int sum = sum(queue1) + sum(queue2);
    int half = sum / 2;
    int sum1 = -1;
    int sum2 = -1;

    for (int i = 0; i < queue1.length; i++) {
      int tmp = arraySum(i, queue1);
      for (int a = 0; a < queue2.length + i; a++) {
        if (a < queue2.length) {
          tmp += queue2[a];
        } else {
          tmp += queue1[a - queue2.length];
        }
        if (tmp == half) {
          sum1 = i + a + 1;
          break;
        } else if (tmp > half) {
          break;
        }
      }
      if (sum1 > 0) {
        break;
      }
    }
    for (int i = 0; i < queue2.length; i++) {
      int tmp = arraySum(i, queue2);
      for (int a = 0; a < queue1.length + i; a++) {
        if (a < queue1.length) {
          tmp += queue1[a];
        } else {
          tmp += queue2[a - queue1.length];
        }
        if (tmp == half) {
          sum2 = i + a + 1;
          break;
        } else if (tmp > half) {
          break;
        }
      }
      if (sum2 > 0) {
        break;
      }
    }

    if (sum1 == -1 && sum2 == -1) {
      answer = -1;
    } else if (sum1 == -1) {
      answer = sum2;
    } else if (sum2 == -1) {
      answer = sum1;
    } else if (sum1 < sum2)
      answer = sum1;
    else
      answer = sum2;

    return answer;
  }

  public static int sum(int[] ins) {
    int sum = 0;
    for (int i : ins) {
      sum += i;
    }
    return sum;
  }

  public static int arraySum(int idx, int[] ins) {
    int sum = 0;
    for (int i = idx; i < ins.length; i++) {
      sum += ins[i];
    }

    return sum;
  }
}
