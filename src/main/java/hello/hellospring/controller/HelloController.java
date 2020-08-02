package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!");
        return "hello";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template"; // View Resolver동작
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam(value = "name")String name){
        return "hello "+name; //생 문자열 날라감 (html body태그에 박힘)
        // @ResponseBody + return String -> HttpMessageConverter : JsonConverter / StringConverter[문자일때 default]
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam(value = "name")String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // @ResponseBody + return 객체이면 JSON 형식으로 넘겨줌
        // -> HttpMessageConverter : JsonConverter[객체일때 default] / StringConverter
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
