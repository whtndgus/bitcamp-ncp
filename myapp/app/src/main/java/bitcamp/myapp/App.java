package bitcamp.myapp;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    String[][] book = {{"15:00", "17:00"}, {"16:40", "18:10"}, {"14:20", "15:40"},
        {"14:10", "19:20"}, {"18:20", "21:20"}};
    String[][] book1 =
        {{"09:10", "09:20"}, {"09:10", "09:40"}, {"09:10", "09:10"}, {"19:10", "19:50"}};
    System.out.println(solution(book1));
  }

  public static int solution(String[][] book_time) {
    int answer = 0;
    int[] stime = new int[book_time.length];
    int[] etime = new int[book_time.length];
    String[] solt = new String[book_time.length];

    for (int i = 0; i < book_time.length; i++) {
      solt[i] = book_time[i][0].substring(0, 2) + book_time[i][0].substring(3, 5)
          + book_time[i][1].substring(0, 2) + book_time[i][1].substring(3, 5);
    }
    Arrays.sort(solt);
    for (int i = 0; i < book_time.length; i++) {
      stime[i] = Integer.parseInt(solt[i].substring(0, 4));
      etime[i] = Integer.parseInt(solt[i].substring(4, 8));
    }
    System.out.println(Arrays.toString(stime));
    System.out.println(Arrays.toString(etime));

    for (int i = 0; i < book_time.length; i++) {
      if (stime[i] == 0)
        continue;
      while (true) {
        int idx = -1;
        for (int a = i + 1; a < book_time.length; a++) {
          if (stime[a] >= etime[i] + 10) {
            idx = a;
            etime[i] = etime[a];
            stime[a] = 0;
            etime[a] = 0;
            break;
          }
        }
        if (idx != -1)
          continue;
        break;
      }
    }


    for (int i = 0; i < book_time.length; i++) {
      if (stime[i] != 0)
        answer++;
    }
    System.out.println(Arrays.toString(stime));
    System.out.println(Arrays.toString(etime));

    return answer;
  }

}
