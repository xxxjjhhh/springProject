//add package
// src/main/java/com.example.project1/dto
// 컨트롤러와 동일한 계층에 패키지 생성

//add class Hellodata.java
//dto가 form데이터를 받음
package com.example.project1.dto;

public class Hellodata {
  
  private String title;
  private String content;
  
  public Hellodata(String title, String content) {
    
    this.title = title;
    this.content = content;
  }
  
}

  

//Controller
package com.example.project1.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class hello {

  
    @PostMapping("/hellodata")
    public String hello (Hellodata form) {
      //dto form 클래스를 불러옴
    }
  
  //아래 필요없음.
  //  @GetMapping("/hello")
  //  public String hello (Model model) {
  //
  //     model.addAttribute("USERNAME", "kimkimkim");
  //     return "hello"; //src/main/resources/templets/hello.mustache
    }

}





// -- html form

<form action="/hellodata" method="post">
  <input type="text" name="title">
  <textarea name="content"></textarea>
  <button type="submit">submit</button>
</form>
