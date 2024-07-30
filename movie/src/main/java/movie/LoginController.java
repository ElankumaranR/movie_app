package movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class LoginController {
    @Autowired
    private service service;
    @GetMapping("/")
    public String login() {
        return "login"; 
    }
    @PostMapping("/login")
    public String postMethodName(@Param("uname") String email,@Param("pass") String pass) {
        return service.getLogin(email, pass);
    }
    @GetMapping("/home")
    public String getMethodName() {
        return "home";
    }
    
    
}