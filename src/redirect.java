package com.example.project1.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/hello") //redir sender
    public String hello (RedirectAttributes redir) {
        
        redir.addAttribute("key", "value");
        return "redirect:/post1";
      //오류시 / 제거
    }
  
  
    @GetMapping("/post1") //redir receiver
    public String hello (@RequestParam("pageNum") String key Model model) {
        
        model.addAttribute("USERNAME", key);
        return "index";
      //오류시 / 제거
    }
  

}

//오류시 @RequestMapping
//RedirAttributes의 경우 파라미터 정보 URI에 노출됨
