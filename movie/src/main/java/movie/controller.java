package movie;
import movie.app.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") 
public class controller {

    @PostMapping("/login")
    public String login(@RequestBody User user){
        if("user".equals(user.getUsername())&&"password".equals(user.getPassword())){
            return "login Successfull";
        }
        else{
            return "invalid credentials";
        }
    }
}