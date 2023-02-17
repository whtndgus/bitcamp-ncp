package bitcamp.myapp.pgms;

public class CloserString { // 뒤에서 부터 확인하고 확인하는 위치 이전까지의 문자열을 뒤집기에 "시간 초과" 걸림
  public static int[] solution(String str) {
    int[] array = new int[str.length()];
    for (int i = str.length() - 1; i > -1; i--) {
      String idx = str.substring(i, i + 1);
      String tmp = rollBack(str.substring(0, i));
      if (tmp.contains(idx)) {
        array[i] = tmp.indexOf(idx) + 1;
      } else {
        array[i] = -1;
      }
    }
    return array;
  }

  public static String rollBack(String str) {
    String sum = "";
    for (int i = str.length() - 1; i > -1; i--) {
      sum += str.substring(i, i + 1);
    }
    return sum;
  }
}
