package bitcamp.myapp.pgms;

import java.util.Arrays;

public class SeeSo_CP {
  public static long solution(int[] weights) {
    long answer = 0;
    Arrays.sort(weights); // 오름차순 정렬 빌트인 함수
    int temp = 0;
    for (int i = 0; i < weights.length - 1; i++) {
      int first = weights[i];
      if (i > 0 && first == weights[i - 1]) {
        temp--;
        answer += temp;
        continue;
      }
      temp = 0;
      int a = check(weights, first, i);
      for (; a > i; a--) {
        int second = weights[a];
        if (first == second || first * 2 == second || first * 3 == second * 2
            || first * 4 == second * 3) {
          temp++;
        }
      }
      answer += temp;
    }

    return answer;
  }

  public static int check(int[] weit, int num, int ins) {
    int left = ins;
    int right = weit.length - 1;

    while (right > left) {
      int middle = left + (right - left) / 2;
      if (num * 2 < weit[middle]) {
        return middle;
      } else {
        left = middle + 1;
      }
    }

    return left;
  }
}
