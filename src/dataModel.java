import org.springframework.ui.Model;



public String hello (Model model) {
  
        model.addAttribute("USERNAME", "kimkimkim"); //key : value
        return "hello"; //mustache
}

