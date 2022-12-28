package bitcamp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@SpringBootApplication
@RestController
public class App {
  public static void main(String[] args) {
    System.out.println(15);
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return ("Hello World!!");
  }

  static class Board {
    int no;
    String title;
    String writer;
    int viewCnt;

    public Board(int n, String t, String w, int v) {
      this.no = n;
      this.title = t;
      this.writer = w;
      this.viewCnt = v;
    }

    public int getNo() {
      return this.no;
    }

    public String getTitle() {
      return this.title;
    }

    public String getWriter() {
      return this.writer;
    }

    public int getViewCnt() {
      return this.viewCnt;
    }
  }

  @GetMapping("/air")
  public Object air() {
    Board[] arr = {new Board(1, "비", "null", 0), new Board(2, "트", "null", 0),
        new Board(3, "캠", "null", 0), new Board(4, "프", "null", 0)};
    System.out.println(arr[2].no);
    return arr;
  }
}
