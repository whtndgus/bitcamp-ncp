package bitcamp.backend.UnivPro;

import java.util.HashMap;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@SpringBootApplication
@RestController
public class ProController {
  static ProDAO dao = new ProDAO();

  @PostMapping("/insert")
  public Object re(String name, String tel, String mail, int school, String universe, String sub,
      int pay) {
    dao.insertPro(name, tel, mail, school, universe, sub, pay);
    return dao.proView();
  }

  @GetMapping("/view")
  public Object view() {
    return dao.proView();
  }

  @GetMapping("/view/{no}")
  public Object view(@PathVariable int no) {
    return dao.proView(no);
  }

  @PutMapping("/view/{no}")
  public Object view(String name, String tel, String mail, int school, String universe, String sub,
      int pay, @PathVariable int no) {
    System.out.println(name);
    return dao.changePro(name, tel, mail, school, universe, sub, pay, no);
  }

  @DeleteMapping("/view/{no}")
  public Object deletePro(@PathVariable int no) {
    HashMap<String, Object> map = new HashMap<>();
    System.out.println(no);
    if (dao.deletePro(no)) {
      map.put("status", "succese");
    } else {
      map.put("status", "failure");
    }
    return map;
  }
}
