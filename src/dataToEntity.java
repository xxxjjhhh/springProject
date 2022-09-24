//user로 부터 받은 data를 Entity로 변환
//우선 패키지 생성 src/main/java/com.example.project1/entity
//해당 패키지 아래에 class 생성 HelloEntity.java

package com.example.project1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HelloEntity {
  
  @Id
  @GeneratedValue //id값을 자동 생성 시켜줌
  private Long id; //default 대표값 entity 구별을 위해서 필요함
  
  @Column
  private String title;
  
  @Column 
  private String content;
  
  public Article(Long id, String title, String content) {
    
    this.id = id;
    this.title = title;
    this.content = content;
  }
}


//

package com.example.project1.cotroller;

import com.example.project1.entity.HelloEntity; //entity 속성 import
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class hello {

    @PostMapping("/hellodata")
    public String hello (Hellodata form) { //Hellodata 클래스의 경우 dto 참조 : github의 getpost/postDataSend.java
      //dto form 클래스를 불러옴
      
      HelloEntity hello = form.toEntity(); //toEntity 클래스를 dto패키지 아래에 있는 Hellodata.java에 생성해야함.
      
    }
  
  //아래 필요없음.
  //  @GetMapping("/hello")
  //  public String hello (Model model) {
  //
  //     model.addAttribute("USERNAME", "kimkimkim");
  //     return "hello"; //src/main/resources/templets/hello.mustache
    }

}


// --dto 에 toEntity 함수 생성
// entity 클래스 경로를 dto클래스에 import

public HelloEntity toEntity(){
  
    return new HelloEntity(null, title, content);
}
