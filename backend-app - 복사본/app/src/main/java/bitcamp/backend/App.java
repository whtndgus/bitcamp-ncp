package bitcamp.backend;

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
}
