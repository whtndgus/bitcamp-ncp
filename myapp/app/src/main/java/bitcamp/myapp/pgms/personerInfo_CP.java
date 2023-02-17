package bitcamp.myapp.pgms;

public class personerInfo_CP {
  public static int[] solution(String today, String[] terms, String[] privacies) {
    int[] tmp = new int[100];
    int[] answer = {};
    int[] month = new int[terms.length];
    int toto = (Integer.parseInt(today.split(" ")[0].split("\\.")[0]) * 12 * 28)
        + (Integer.parseInt(today.split(" ")[0].split("\\.")[1]) * 28)
        + Integer.parseInt(today.split(" ")[0].split("\\.")[2]);

    String all = "";
    int count = 0;
    for (int i = 0; i < terms.length; i++) {
      all += terms[i].split(" ")[0];
      month[i] = Integer.parseInt(terms[i].split(" ")[1]);
    }

    for (int i = 0; i < privacies.length; i++) {
      String alpha = privacies[i].split(" ")[1];
      int day = (Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0]) * 12 * 28)
          + (Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1]) * 28)
          + Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[2]);
      day = day + (month[all.indexOf(alpha)] * 28);
      if (day <= toto) {
        tmp[count++] = i + 1;
      }
    }
    answer = cutArray(tmp, count);
    return answer;
  }

  public static int[] cutArray(int[] array, int count) {
    int[] tmp = new int[count];
    for (int i = 0; i < count; i++) {
      tmp[i] = array[i];
    }
    return tmp;
  }
}
