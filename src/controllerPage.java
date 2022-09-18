package com.example.project1.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/hello")
    public String hello (Model model) {
        model.addAttribute("USERNAME", "kimkimkim");
        return "hello"; //src/main/resources/templets/hello.mustache
    }

}




//
hello.mustache
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>hello</title>
</head>
<body>
    <p>hello hi {{USERNAME}}</p>
</body>
</html>
