package bitcamp.myapp.eomcs;

import java.sql.Date;

// 회원 데이터를 담을 메모리를 설계한다.
public class Member {
  private int no; // 필드

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

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getPostNo() {
    return postNo;
  }

  public void setPostNo(String postNo) {
    this.postNo = postNo;
  }

  public String getBasicAddress() {
    return basicAddress;
  }

  public void setBasicAddress(String basicAddress) {
    this.basicAddress = basicAddress;
  }

  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

  public boolean isWorking() {
    return working;
  }

  public void setWorking(boolean working) {
    this.working = working;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public byte getLevel() {
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

  private String name;
  private String tel;
  private String postNo;
  private String basicAddress;
  private String detailAddress;
  private boolean working;
  private char gender;
  private byte level;
  private String createdDate;

  public Member() {
    this.no = Prompt.inputInt("번호? ");
    this.name = Prompt.inputString("이름? ");
    this.tel = Prompt.inputString("전화? ");
    this.postNo = Prompt.inputString("우편번호? ");
    this.basicAddress = Prompt.inputString("주소1? ");
    this.detailAddress = Prompt.inputString("주소2? ");
    this.working = Prompt.inputInt("0. 미취업\n1. 재직중\n재직자? ") == 1;
    this.gender = Prompt.inputInt("0. 남자\n1. 여자\n성별? ") == 0 ? 'M' : 'W';
    this.level = (byte) Prompt.inputInt("0. 비전공자\n1. 준전공자\n2. 전공자\n전공? ");
    this.createdDate = new Date(System.currentTimeMillis()).toString();
  }
}
