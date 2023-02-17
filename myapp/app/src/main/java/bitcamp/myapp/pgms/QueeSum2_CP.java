package bitcamp.myapp.pgms;

public class QueeSum2_CP {
  public static int solution(int[] queue1, int[] queue2) {
    int size = queue1.length;
    int max = size * 2;
    long sum1 = sum(queue1);
    long sum2 = sum(queue2);
    int idx1 = 0;
    int idx2 = 0;

    for (int i = 0; i < queue1.length * 3; i++) {
      if (sum1 > sum2) {
        if (idx1 < size) {
          sum2 += queue1[idx1];
          sum1 -= queue1[idx1];
          idx1++;
        } else if (idx1 >= size && idx1 < max) {
          sum2 += queue2[idx1 - size];
          sum1 -= queue2[idx1 - size];
          idx1++;
        } else {
          sum2 += queue1[idx1 - max];
          sum1 -= queue1[idx1 - max];
          idx1++;
        }
      } else if (sum1 < sum2) {
        if (idx2 < size) {
          sum1 += queue2[idx2];
          sum2 -= queue2[idx2];
          idx2++;
        } else if (idx2 >= size && idx2 < max) {
          sum1 += queue1[idx2 - size];
          sum2 -= queue1[idx2 - size];
          idx2++;
        } else {
          sum1 += queue2[idx2 - max];
          sum2 -= queue2[idx2 - max];
          idx2++;
        }
      } else {
        return i;
      }
    }

    return -1;
  }

  public static int sum(int[] array) {
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return sum;
  }
}
