package bitcamp.myapp.pgms;

public class CountGame_CP {
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
    int max = max(ins);
    int result = 0;
    if (max == 0) {
      return ins[0];
    }
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
    int max = 0;
    boolean check = true;

    for (int i = 0; i < ins.length; i++) {
      if (ins[i] > max) {
        max = ins[i];
      }
      if (i > 0 && ins[i] != ins[i - 1]) {
        check = false;
      }
    }
    if (check) {
      return 0;
    }
    return max;
  }
}
