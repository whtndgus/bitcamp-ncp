package bitcamp.myapp.pgms;

public class BowCup {
  static int sumMi = 0;
  static int[] Answer = new int[11];

  static int[] solution(int n, int[] info) {
    int[] answer = new int[11];
    int m = n++;

    for (int a = 0; a < n; a++) { // answer 의 1번째 값
      answer[0] = a;
      int acount = a;

      for (int b = 0; b < n - acount; b++) { // answer 의 2번째 값
        answer[1] = b;
        int bcount = acount + b;

        for (int c = 0; c < n - bcount; c++) { // answer 의 3번째 값
          answer[2] = c;
          int ccount = bcount + c;

          for (int d = 0; d < n - ccount; d++) { // answer 의 4번째 값
            answer[3] = d;
            int dcount = ccount + d;

            for (int e = 0; e < n - dcount; e++) { // answer 의 5번째 값
              answer[4] = e;
              int ecount = dcount + e;

              for (int f = 0; f < n - ecount; f++) { // answer 의 6번째 값
                answer[5] = f;
                int fcount = ecount + f;

                for (int g = 0; g < n - fcount; g++) { // answer 의 7번째 값
                  answer[6] = g;
                  int gcount = fcount + g;

                  for (int h = 0; h < n - gcount; h++) { // answer 의 8번째 값
                    answer[7] = h;
                    int hcount = gcount + h;

                    for (int i = 0; i < n - hcount; i++) { // answer 의 9번째 값
                      answer[8] = i;
                      int icount = hcount + i;

                      for (int j = 0; j < n - icount; j++) { // answer 의 10번째 값
                        answer[9] = j;
                        int jcount = icount + j;

                        for (int k = 0; k < n - jcount; k++) { // answer 의 11번째 값
                          answer[10] = k;
                          check(answer, info, m);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    if (sumMi == 0) {
      Answer = new int[] {-1};
    }
    return Answer;
  }

  public static void prin(int[] in) {
    for (int i : in) {
      System.out.print(i + " ");
    }
  }

  public static int bs(int[] ins) {
    int sum = 0;
    for (int i = 0; i < ins.length; i++) {
      sum += (10 - i) * ins[i]; // 배열의 길이는 11, 1번째 부터 10점
    }
    return sum;
  }

  static int sum(int[] in) {
    int sum = 0;
    for (int i : in) {
      sum += i;
    }
    return sum;
  }

  public static int[] check(int[] rion, int[] apach, int n) {
    if (sum(rion) != n) {
      return new int[] {-1};
    }
    int rsum = 0;
    int asum = 0;
    for (int i = 0; i < rion.length; i++) {
      if (rion[i] > apach[i]) {
        rsum += 10 - i;
      } else if (rion[i] <= apach[i] && apach[i] > 0) {
        asum += 10 - i;
      }
    }

    if (rsum - asum > sumMi) {
      sumMi = rsum - asum;
      Answer = rion.clone();
      return rion;
    } else {
      return new int[] {-1};
    }
  }
}
