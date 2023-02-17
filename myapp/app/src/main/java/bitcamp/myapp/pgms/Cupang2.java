package bitcamp.myapp.pgms;

public class Cupang2 {
  public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
    int answer = 0;
    int deliver = sum(deliveries);
    int pickup = sum(pickups);
    int box = 0;
    int rbox = 0;
    int max = 0;
    int fin = n - 1;
    int rfin = n - 1;
    System.out.println(deliver + " " + pickup);

    while (deliver + pickup > 0) {
      for (int i = (fin > rfin ? fin : rfin); i > -1; i--) {
        if (deliveries[i] > 0 || pickups[i] > 0) {
          max = i;
          break;
        }
      }
      if (deliver > 0) {
        box = cap;
      }
      if (pickup > 0) {
        rbox = cap;
      }

      for (int i = fin; i > -1; i--) {

        if (deliveries[i] > box) {
          deliveries[i] -= box;
          deliver -= box;
          box = 0;
          fin = i;
          break;
        } else if (deliveries[i] < box) {
          box -= deliveries[i];
          deliver -= deliveries[i];
          deliveries[i] = 0;

        } else {
          deliver -= deliveries[i];
          box = 0;
          deliveries[i] = 0;
        }

      }
      for (int i = rfin; i > -1; i--) {
        if (pickups[i] > rbox) {
          pickups[i] -= rbox;
          pickup -= rbox;
          rfin = i;
          rbox = 0;
          break;

        } else if (pickups[i] < rbox) {
          rbox -= pickups[i];
          pickup -= pickups[i];
          pickups[i] = 0;

        } else {
          pickup -= pickups[i];
          rbox = 0;
          pickups[i] = 0;
        }
      }
      if (deliver == 0) {
        fin = -1;
      }
      if (pickup == 0) {
        rfin = -1;
      }

      answer += max + 1;
      System.out.println(deliver + " " + pickup + " " + (max + 1));
    }
    return answer * 2;
  }

  public static int sum(int[] ins) {
    int sum = 0;
    for (int i : ins)
      sum += i;
    return sum;
  }
}
