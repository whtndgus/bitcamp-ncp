package bitcamp.myapp.pgms;

import java.util.Arrays;

/* 1단계 신고 결과 통보 [https://school.programmers.co.kr/learn/courses/30/lessons/92334] */
public class chatReport_PMS_12_30 {
  public static int[] solution(String[] id_list, String[] report, int k) {
    int userCount = id_list.length;
    int[] answer = new int[userCount]; // answer 의 배열의 길이는 userCount 의 값과 같아야 한다

    String[] reports = new String[report.length];
    int[] users = new int[userCount];
    boolean[] trues = new boolean[userCount];
    int recount = 0;
    for (String str : report) {
      String[] tmps = str.split(" "); // report 의 각 문자열을 띄어쓰기 기준으로 분리하여 저장
      String tms =
          Arrays.asList(id_list).indexOf(tmps[0]) + " " + Arrays.asList(id_list).indexOf(tmps[1]);

      java.util.List<String> rs = new java.util.ArrayList<>(Arrays.asList(reports));
      if (!rs.contains(tms)) { // 현재 배열에 해당 유저의 해당 상대유저 신고정보가 존재 하지 않는가
        reports[recount++] = tms;
        users[Arrays.asList(id_list).indexOf(tmps[1])]++; // 신고 유저 index 위치 값 상승
        if (users[Arrays.asList(id_list).indexOf(tmps[1])] >= k) { // 신고 수가 제한을 넘을때
          trues[Arrays.asList(id_list).indexOf(tmps[1])] = true;
        }
      } ;
    }
    for (String str : report) {
      String[] tmps = str.split(" ");
      if (trues[Arrays.asList(id_list).indexOf(tmps[1])]) {
        answer[Arrays.asList(id_list).indexOf(tmps[0])] += 1;
      }
    }
    // for (int b : users) {
    // System.out.println(b);
    // }
    return answer;
  }
}
