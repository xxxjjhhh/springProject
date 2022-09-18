//사용자로 부터 data 전송 코드와 data -> entity 클래스 및 속성은 생략

package com.example.project1.cotroller;

import com.example.project1.repository.HelloRepository; // repository 패키지 내부에 해당 클래스 import
import com.example.project1.entity.HelloEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class hello {
  
    @Autowired //springboot가 이후 객체 자동 연결
    private HelloRepository helloRepository; 

    @PostMapping("/hellodata")
    public String hello (Hellodata form) { //Hellodata 클래스의 경우 dto 참조 : github의 getpost/postDataSend.java
      //dto form 클래스를 불러옴
      
      Hello hello = form.toEntity(); //toEntity 클래스를 dto패키지 아래에 있는 Hellodata.java에 생성해야함.
      
      //entity -> repository
      Hello saved = helloRepository.save(hello);
      
      return "";
      
    }
  
  //아래 필요없음.
  //  @GetMapping("/hello")
  //  public String hello (Model model) {
  //
  //     model.addAttribute("USERNAME", "kimkimkim");
  //     return "hello"; //src/main/resources/templets/hello.mustache
    }

}
