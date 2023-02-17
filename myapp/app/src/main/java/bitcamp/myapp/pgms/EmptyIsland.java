package bitcamp.myapp.pgms;

import java.util.ArrayList;
import java.util.Arrays;

public class EmptyIsland {

  public static int[] solution(String[] maps) {
    int[] answer = {};
    char[][] map = new char[maps.length][];
    boolean[][] visit = new boolean[maps.length][maps[0].length()];
    ArrayList<Integer> ans = new ArrayList<>();
    int y = 0;
    int x = 0;

    for (int i = 0; i < map.length; i++) {
      map[i] = maps[i].toCharArray();
    }

    for (int a = 0; a < map.length; a++) {
      y = a;
      for (int b = 0; b < map[a].length; b++) {
        x = b;
        int temp = check(map, visit, x, y);
        if (temp > 0)
          ans.add(temp);
      }
    }
    if (!ans.isEmpty()) {
      answer = ans.stream().mapToInt(i -> i).toArray();
    } else {
      answer = new int[] {-1};
    }
    Arrays.sort(answer);
    return answer;
  }

  public static int check(char[][] map, boolean[][] visit, int x, int y) {
    int temp = 0;
    if (x < 0 || y < 0 || y >= map.length || x >= map[y].length) {
      return 0;
    }
    if (map[y][x] == 'X' || visit[y][x]) {
      return 0;
    }

    visit[y][x] = true;
    temp = map[y][x] - '0';

    temp = temp + check(map, visit, x + 1, y);
    temp = temp + check(map, visit, x, y + 1);
    temp = temp + check(map, visit, x - 1, y);
    temp = temp + check(map, visit, x, y - 1);

    return temp;
  }
}
