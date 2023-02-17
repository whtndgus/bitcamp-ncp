package bitcamp.backend.user.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class User {
  private int no;
  private String name;
  private String password;
  private boolean working;
  private boolean gender;
  private int level;
  private String createdDate;

  public User(int no, String name, String password, boolean work, boolean gen, int level) {
    this.no = no;
    this.name = name;
    this.password = password;
    this.working = work;
    this.gender = gen;
    this.level = level;
    createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시"));
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void change(String name, boolean work, boolean gen, int level) {
    this.name = name;
    this.working = work;
    this.gender = gen;
    this.level = level;
    createdDate = new Date(System.currentTimeMillis()).toString();
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isWorking() {
    return working;
  }

  public void setWorking(boolean working) {
    this.working = working;
  }

  public boolean getGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(byte level) {
    this.level = level;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

}
