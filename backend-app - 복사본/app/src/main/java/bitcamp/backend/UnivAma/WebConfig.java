package bitcamp.backend.UnivAma;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
  public WebConfig() {
    System.out.println("asvasdasdㅁㄴ이ㅏㅓㅁ차ㅜㅁㄴ이ㅏㅁ");
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedOrigins("http://192.168.0.7:5500", "Http://127.0.0.1:5500");
  }
}
