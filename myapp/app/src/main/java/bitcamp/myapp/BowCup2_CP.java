package bitcamp.myapp;


public class BowCup2_CP {
  public static int[] solution(int n, int[] info) throws InterruptedException {
    int[] result = {};
    int[] check = new int[1];
    int[] ints = new int[11];
    int end = -1;
    int count = n;

    for (int a = 10; a > end; a--) {
      ints[10] = a;
      int acount = count - a;

      for (int b = acount; b > end; b--) {
        ints[9] = b;
        int bcount = acount - b;

        for (int c = bcount; c > end; c--) {
          ints[8] = c;
          int ccount = bcount - c;

          for (int d = ccount; d > end; d--) {
            ints[7] = d;
            int dcount = ccount - d;

            for (int e = dcount; e > end; e--) {
              ints[6] = e;
              int ecount = dcount - e;

              for (int f = ecount; f > end; f--) {
                ints[5] = f;
                int fcount = ecount - f;

                for (int g = fcount; g > end; g--) {
                  ints[4] = g;
                  int gcount = fcount - g;

                  for (int h = gcount; h > end; h--) {
                    ints[3] = h;
                    int hcount = gcount - h;

                    for (int i = hcount; i > end; i--) {
                      ints[2] = i;
                      int icount = hcount - i;

                      for (int j = icount; j > end; j--) {
                        ints[1] = j;
                        int jcount = icount - j;

                        for (int k = jcount; k > end; k--) {
                          ints[0] = k;
                          result = winCheck(ints, info, check, result);
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
    return result;
  }

  public static void prin(int[] ins) {
    for (int i : ins) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static int[] winCheck(int[] rion, int[] apach, int[] check, int[] result)
      throws InterruptedException {
    int def = -1;
    int rioncount = 0;
    int apachcount = 0;

    for (int i = 0; i < 11; i++) {
      if (rion[i] > apach[i]) {
        rioncount += 10 - i;
      } else if (rion[i] <= apach[i] && apach[i] > 0) {
        apachcount += 10 - i;
      }
    }

    if (rioncount > apachcount || check[0] != 0) {
      def = rioncount - apachcount;
      if (def > check[0]) {
        check[0] = def;
        result = rion.clone();
      }
    } else {
      result = new int[] {-1};
    }

    return result;
  }
}
