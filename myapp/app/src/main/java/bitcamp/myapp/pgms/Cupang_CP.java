package bitcamp.myapp.pgms;

public class Cupang_CP {
  public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
    long answer = 0;
    int box = cap;
    int rbox = cap;
    int max = 0;
    int gostop = n;
    int backstop = n;
    while (true) {
      for (int i = n - 1; i > -1; i--) {
        if (deliveries[i] > 0 && max == 0) {
          max = i + 1;
          break;
        } else if (pickups[i] > 0 && max == 0) {
          max = i + 1;
          break;
        }
      }
      for (int i = gostop - 1; i > -1; i--) {

        if (box > 0 && deliveries[i] > 0) {
          if (deliveries[i] > box) {
            deliveries[i] -= box;
            box = 0;
            gostop = i + 1;
            break;
          } else if (deliveries[i] < box) {
            box -= deliveries[i];
            deliveries[i] = 0;
          } else {
            gostop = i;
            box = 0;
            deliveries[i] = 0;
            break;
          }
        }
      }
      for (int i = backstop - 1; i > -1; i--) {

        if (rbox > 0 && pickups[i] > 0) {
          if (pickups[i] > rbox) {
            pickups[i] -= rbox;
            rbox = 0;
            backstop = i + 1;
            break;
          } else if (pickups[i] < rbox) {
            rbox -= pickups[i];
            pickups[i] = 0;
          } else {
            backstop = i;
            rbox = 0;
            pickups[i] = 0;
            break;
          }
        }
      }
      if (box == cap && rbox == cap) {
        break;
      } else {
        answer += max;
        n = gostop > backstop ? gostop : backstop;
        box = cap;
        rbox = cap;
        max = 0;
      }
    }
    return answer * 2;
  }
}
