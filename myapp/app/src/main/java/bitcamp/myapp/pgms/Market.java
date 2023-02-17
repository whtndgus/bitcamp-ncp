package bitcamp.myapp.pgms;

import java.util.Arrays;
import java.util.List;

public class Market {
  static int solution(String[] want, int[] number, String[] discount) {
    int count = 0;
    int[] backup = number.clone();

    List<String> list = Arrays.asList(want);

    for (int i = 0; i < discount.length - 9; i++) {
      if (list.contains(discount[i])) {

        for (int ii = 0; ii < 10; ii++) {
          String str = discount[i + ii];
          if (list.contains(str) && number[list.indexOf(str)] > 0) {
            number[list.indexOf(str)] -= 1;
          } else {
            number = backup.clone();
            break;
          }
          if (sum(number) == 0) {
            number = backup.clone();
            ++count;
          }
        }
      }
    }
    return count;
  }

  static int sum(int[] in) {
    int sum = 0;
    for (int i : in) {
      sum += i;
    }
    return sum;
  }
}
