package bitcamp.backend.user;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import bitcamp.backend.user.service.BoardService;
import bitcamp.backend.user.vo.Board;

@CrossOrigin("*")
@SpringBootApplication
@RestController
@ResponseBody
public class App {

  @Autowired
  private BoardService boardService;

  public static void main(String args[]) {
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return ("Hello World!!");
  }

  @PostMapping("/insert")
  @ResponseBody
  public void sayHello(@RequestBody HashMap<String, Object> param) {
    System.out.println("param : " + param);
    String str = "";

    str += param.get("name") + ",";
    str += param.get("age") + ",";
    str += param.get("gender") + ",";
    str += param.get("tel") + ",";
    str += param.get("addr1") + " " + param.get("addr2") + ",";
    str += param.get("another");

    Board board = new Board((String) param.get("title"), (String) param.get("password"),
        (String) param.get("pain"), str);
    System.out.println();
    boardService.add(board);
  }


  @PostMapping("/in")
  public Object faceb(@RequestBody HashMap<String, Object> param) {
    String str = (String) param.get("accessToken");
    System.out.println("액세스 토큰 : " + str);

    RestTemplate restTemplate = new RestTemplate();
    Map result = restTemplate.getForObject(
        "https://graph.facebook.com/v16.0/me?access_token={value1}&fields={value2}", Map.class, str,
        "id,name,email,gender");


    return result;
  }
}
