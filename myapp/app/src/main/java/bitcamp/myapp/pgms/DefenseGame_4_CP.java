package bitcamp.myapp.pgms;

import java.util.Collections;
import java.util.PriorityQueue;

public class DefenseGame_4_CP {
  public static int solution(int n, int k, int[] enemy) {
    int answer = 0;
    PriorityQueue<Integer> ins = new PriorityQueue<>(Collections.reverseOrder());
    if (k >= enemy.length) {
      return enemy.length;
    }
    for (int i = 0; i < enemy.length; i++) {
      if (n >= enemy[i]) {
        ins.add(enemy[i]);
        n -= enemy[i];
      } else if (n < enemy[i]) {
        if (k > 0) {
          if (ins.size() > 0) {
            ins.add(enemy[i]);
            n += ins.peek() - enemy[i];
            ins.remove();
          }
          k--;
        } else {
          answer = i;
          break;
        }
      }
      if (i == enemy.length - 1) {
        answer = i + 1;
      }
    }
    return answer;
  }
}
