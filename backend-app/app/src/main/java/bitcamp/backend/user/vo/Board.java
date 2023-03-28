package bitcamp.backend.user.vo;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

@Data
public class Board {

  @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
  private Date createdDate;
  int no;

  String title;
  String password;
  String pain;
  String another;

  // String name;
  // int age;
  // boolean gender;
  // String tel;
  // String addr1;
  // String addr2;
  public Board(String title, String password, String pain, String another) {
    super();
    this.title = title;
    this.password = password;
    this.pain = pain;
    this.another = another;
  }
}
