package bitcamp.backend.UnivPro;

import java.util.Arrays;

public class ProDAO {
  private Pro[] pros = new Pro[100000];
  private int count = 0;
  private int iny = 1;

  public ProDAO() {
    // TODO Auto-generated constructor stub
  }

  public void insertPro(String name, String tel, String mail, int school, String universe,
      String sub, int pay) {
    this.pros[this.count++] = new Pro(name, tel, mail, school, universe, sub, pay, iny++);
  }

  public Object proView() {
    return Arrays.copyOf(pros, count);
  }

  public Object proView(int idx) {
    for (int i = 0; i < this.count; i++) {
      if (this.pros[i].getNo() == idx + 1) {
        return pros[i];
      }
    }
    return null;
  }

  public Object changePro(String name, String tel, String mail, int school, String universe,
      String sub, int pay, int idx) {
    pros[idx].changePro(name, tel, mail, school, universe, sub, pay);
    return pros[idx];
  }

  public boolean deletePro(int idx) {
    for (int i = 0; i < this.count; i++) {
      if (this.pros[i].getNo() == idx + 1) {
        for (int a = i; a < this.count; a++) {
          this.pros[a] = this.pros[a + 1];
        }
        this.count--;
        return true;
      }
    }
    return false;
  }
}
