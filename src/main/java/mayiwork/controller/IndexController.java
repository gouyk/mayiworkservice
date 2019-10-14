package mayiwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {
  @RequestMapping("index")
  public String index(){

      Runnable runnable = () -> System.out.println("234234");

      return  "index";
  }

}
