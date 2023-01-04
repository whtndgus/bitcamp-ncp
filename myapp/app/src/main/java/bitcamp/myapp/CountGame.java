package bitcamp.myapp;

public class CountGame {
  public static int solution(int[] arrayA, int[] arrayB) {
    int answer = 0;

    int maxa = maxGongYacsu(arrayA);
    int maxb = maxGongYacsu(arrayB);

    for (int i = 0; i < arrayB.length; i++) {
      if (maxa == 0 || arrayB[i] % maxa == 0) {
        maxa = 0;
        break;
      }
    }
    for (int i = 0; i < arrayA.length; i++) {
      if (maxb == 0 || arrayA[i] % maxb == 0) {
        maxb = 0;
        break;
      }
    }
    if (maxa + maxb == 0) {
      return 0;
    }

    if (maxa > maxb) {
      answer = maxa;
    } else {
      answer = maxb;
    }
    return answer;
  }

  public static int maxGongYacsu(int[] ins) {
    if (ins.length == 0) {
      return 0;
    }
    int max = max(ins);
    int result = 0;

    for (int i = max / 2; i > 1; i--) {
      boolean check = false;

      for (int ii = 0; ii < ins.length; ii++) {
        if (ins[ii] % i == 0) {
          check = true;
        } else {
          check = false;
          break;
        }
      }

      if (check) {
        result = i;
        break;
      }
    }

    return result;
  }

  public static int max(int[] ins) {
    int max = ins[0];

    for (int i = 0; i < ins.length; i++) {
      if (ins[i] > max)
        max = ins[i];
    }

    return max;
  }
}
