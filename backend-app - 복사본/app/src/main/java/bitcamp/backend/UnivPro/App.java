package bitcamp.backend.UnivPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@SpringBootApplication
@RestController
public class App {
  static int count = 0;

  public static void main(String args[]) {
    SpringApplication.run(App.class, args);
  }

}
