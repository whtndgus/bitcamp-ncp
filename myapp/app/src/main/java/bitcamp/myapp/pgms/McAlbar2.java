package bitcamp.myapp.pgms;

public class McAlbar2 {
  public static int solution(int[] ingredient) {
    int answer = 0;
    int count = 0;

    for (int i = 0; i < ingredient.length; i++) {
      int idx = ingredient[i];

      if (idx == 1) {
        count++;
      } else if (idx == 2) {
        if (i + 2 < ingredient.length && count > 0 && ingredient[i + 1] == 3
            && ingredient[i + 2] == 1) {
          count--;
          i += 2;
          answer++;
        } else if (i + 1 < ingredient.length && ingredient[i + 1] == 2) {
          i += 1;
          count = 0;
        }
      } else {
        count = 0;
      }
    }

    return answer;
  }
}
