package com.example.project1.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @PostMapping("/hello") //redir sender
    public String hello (RedirectAttributes redir) {
        
        redir.addFlashAttribute("key", "value");
        //flash가 붙으면 uri에 파라미터 공개가 안됨.
        return "forward:/post1";
      //오류시 / 제거
    }
  
  
    @PostMapping("/post1") //redir receiver
    public String hello (@RequestParam("pageNum")String key Model model) {
        
        model.addAttribute("USERNAME", key);
        return "index";
      //오류시 / 제거
    }
}
