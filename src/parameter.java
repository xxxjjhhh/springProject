//get query string request
@RequestParam("value")String str 
//@RequestParam(value = "value")String str
//무조건 값이 전달되어야 되기 때문에 없을 경우 error발생 defaultValue = "defaultvalue" 설정을 하거나 required = false 설정을 해주면 된다.

//all parameter
@RequestParam Map<String, Object> allstr

//post(Json)
@RequestBody Map<String, String> body
@RequestBody User instance
//객체로 받는 경우 DTO 모델을 만들기 때문에 Map 방식을 사용하면 된다.

//dto or instance
@ModelAttribute DTO data




// -- Map 방식 자세히

{
  "Id" : "hi",
  "age" : 16,
  "city" : "Seuoul"
}

@RequestBody Map<String, String> body

String id = body.get("Id");
String age = body.get("age");
String city = body.get("city");
