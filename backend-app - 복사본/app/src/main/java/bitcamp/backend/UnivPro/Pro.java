package bitcamp.backend.UnivPro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pro {
  private String name;
  private String tel;
  private String mail;
  private int school;
  private String universe;
  private String sub;
  private int pay;
  private int no;
  private String mekeDay;

  public Pro(String name, String tel, String mail, int school, String universe, String sub, int pay,
      int no) {
    super();
    this.name = name;
    this.tel = tel;
    this.mail = mail;
    this.school = school;
    this.universe = universe;
    this.sub = sub;
    this.pay = pay;
    this.no = no;
    this.mekeDay = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH"));;
  }

  public void changePro(String name, String tel, String mail, int school, String universe,
      String sub, int pay) {
    this.name = name;
    this.tel = tel;
    this.mail = mail;
    this.school = school;
    this.universe = universe;
    this.sub = sub;
    this.pay = pay;
    this.mekeDay = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH"));;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public int getSchool() {
    return school;
  }

  public void setSchool(int school) {
    this.school = school;
  }

  public String getUniverse() {
    return universe;
  }

  public void setUniverse(String universe) {
    this.universe = universe;
  }

  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public int getPay() {
    return pay;
  }

  public void setPay(int pay) {
    this.pay = pay;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getMekeDay() {
    return mekeDay;
  }
}
