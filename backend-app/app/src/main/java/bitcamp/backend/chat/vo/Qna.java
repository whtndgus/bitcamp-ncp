package bitcamp.backend.chat.vo;

public class Qna {
  private int no;
  private String title;
  private String id;
  private String content;
  private String qpassword;
  private String createdDate;
  private int viewCount;
  private boolean answer;
  private String aid;

  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }

  public String getApassword() {
    return apassword;
  }

  public void setApassword(String apassword) {
    this.apassword = apassword;
  }

  private String apassword;

  public boolean getAnswer() {
    return answer;
  }

  public void setAnswer(boolean answer) {
    this.answer = answer;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getQpassword() {
    return qpassword;
  }

  public void setQpassword(String qpassword) {
    this.qpassword = qpassword;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
}
