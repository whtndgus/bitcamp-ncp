package bitcamp.myapp.pgms;

import java.util.ArrayList;

public class DefenseGame_3 {
  public static int solution(int n, int k, int[] enemy) {
    int answer = 0;
    ArrayList<Integer> ins = new ArrayList<>();
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
            n = sol(n, ins, enemy[i]);
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

  public static int sol(int n, ArrayList<Integer> ins, int enemy) {
    ins.add(enemy);

    int max = 0;
    int idx = -1;
    for (int i = 0; i < ins.size(); i++) {
      if (ins.get(i) > max) {
        max = ins.get(i);
        idx = i;
      }
    }

    ins.remove(idx);
    n -= enemy;
    n += max;
    return n;
  }
}
