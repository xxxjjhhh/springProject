@GetMapping("/{date}")
public String main(@PathVariable("date") String date) {
  
    return "page"; 
}
