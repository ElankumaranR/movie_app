package movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class MainController {
    @Autowired
    private service service;
    @GetMapping("/")
    public String index() {
        return "login"; 
    }
    @PostMapping("/login")
    public String login(@Param("uname") String uname,@Param("pass") String pass) {
        return service.getLogin(uname, pass);
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/dash")
    public String dash() {
        return "dash";
    }
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
    @PostMapping("/save")
    public String save(@Param("uname") String uname,@Param("pass") String pass) {
        return service.add(uname,pass,"user");
    }
    
    
}