package bitcamp.myapp.pgms;

public class HomeSteal {
  public static int solution(int[] money) {
    int sum = 0;
    int first = 0;
    int second = 0;

    for (int a = 0; a < 2; a++) {

      for (int i = a; i < money.length;) {
        sum += money[i];
        if (i + 5 < money.length) {
          int suma = money[i + 2] + money[i + 4];
          int sumb = money[i + 3] + money[i + 5];

          if (sumb > suma) {
            i += 3;
          } else {
            i += 2;
          }
        } else if (i + 4 < money.length) {
          int suma = money[i + 2] + money[i + 4];
          int sumb = money[i + 3];

          if (sumb > suma) {
            i += 3;
          } else {
            i += 2;
          }
        } else if (i + 3 < money.length) {
          int suma = money[i + 2];
          int sumb = money[i + 3];

          if (sumb > suma) {
            i += 3;
          } else {
            i += 2;
          }
        } else if (i + 2 < money.length) {
          i += 2;
        } else {
          break;
        }
      }
      if (a == 0) {
        first = sum;
        sum = 0;
        System.out.println(first);
      } else {
        second = sum;
        sum = 0;
        System.out.println(second);
      }
    }
    if (first > second) {
      sum = first;
    } else {
      sum = second;
    }
    return sum;
  }
}
