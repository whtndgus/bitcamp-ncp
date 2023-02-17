package bitcamp.myapp.pgms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class chatReport_2_CP {
  public static int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];
    List<String> idlist = Arrays.asList(id_list);
    int[] counts = new int[id_list.length];
    HashSet<String> repot = new HashSet<>();

    for (int i = 0; i < report.length; i++) {
      String str = report[i];
      if (repot.add(str)) {
        int idx = idlist.indexOf(str.split(" ")[1]);
        counts[idx]++;
      }
    }

    for (int i = 0; i < counts.length; i++) {
      if (counts[i] >= k) {
        String rman = id_list[i];
        for (int a = 0; a < id_list.length; a++) {
          String man = id_list[a];
          if (repot.contains(man + " " + rman)) {
            answer[a]++;
          }
        }
      }
    }

    return answer;
  }
}
