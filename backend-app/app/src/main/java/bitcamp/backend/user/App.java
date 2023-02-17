package bitcamp.backend.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import bitcamp.backend.user.controller.UserControll;

@CrossOrigin("*")
@SpringBootApplication
@RestController
public class App {

  public static void main(String args[]) {
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return ("Hello World!!");
  }

  @PostMapping("/insert")
  public Object insert(@RequestParam(name = "send") String send) {
    UserControll.insert(send.split(",")[0], send.split(",")[1], send.split(",")[2],
        send.split(",")[3], send.split(",")[4]);
    System.out.println(send);
    return UserControll.printUser();
  }

  @DeleteMapping("/reset")
  public void reset() {
    UserControll.resetUser();
  }
}
