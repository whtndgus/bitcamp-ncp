package bitcamp.myapp.pgms;

public class CloserString2 { // 이전방식과는 다르게 뒤에서부터 해당위치 부터 앞으로 한칸씩 확인하여 정수 확인
  public static int[] solution(String str) {
    int[] array = new int[str.length()];

    for (int i = str.length() - 1; i > -1; i--) {
      String idx = str.charAt(i) + "";
      String tmp = str.substring(0, i);

      if (tmp.contains(idx)) {
        array[i] = rollBack(tmp, idx);
      } else {
        array[i] = -1;
      }
    }

    return array;
  }


  public static int rollBack(String str, String idx) {
    int sum = 0;
    for (int i = str.length() - 1; i > -1; i--) {
      sum++;
      if ((str.charAt(i) + "").equals(idx)) {
        break;
      }
    }
    return sum;
  }
}
