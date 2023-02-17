package bitcamp.myapp.pgms;

public class McAlbar {
  public static int solution(int[] ingredient) {
    int answer = 0;
    String ham = "1231";
    String str = arrayString(ingredient);
    while (true) {
      if (str.contains(ham)) {
        int idx = str.indexOf(ham);
        str = str.substring(0, idx) + str.substring(idx + 4, str.length());
        answer++;
      } else {
        break;
      }
    }

    return answer;
  }

  public static String arrayString(int[] array) {
    String str = "";
    for (int i : array)
      str += i;
    return str;
  }
}
