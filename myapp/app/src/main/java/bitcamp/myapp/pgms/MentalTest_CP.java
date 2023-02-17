package bitcamp.myapp.pgms;

public class MentalTest_CP {
  public static String solution(String[] survey, int[] choices) {
    String answer = "";
    String mentals = "RTCFJMAN";
    int[] menstali = new int[8];

    for (int i = 0; i < choices.length; i++) {
      if (choices[i] < 4) {
        int idx = mentals.indexOf(survey[i].substring(0, 1));
        menstali[idx] += Math.abs(choices[i] - 4);
      } else if (choices[i] > 4) {
        int idx = mentals.indexOf(survey[i].substring(1, 2));
        menstali[idx] += Math.abs(choices[i] - 4);
      }
    }

    for (int i = 0; i < menstali.length; i += 2) {
      if (menstali[i + 1] > menstali[i]) {
        answer += mentals.substring(i + 1, i + 2);
      } else {
        answer += mentals.substring(i, i + 1);
      }
    }
    return answer;
  }
}
