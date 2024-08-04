package movie;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;
@Service
public class service {
    @Autowired private repository rep;
    public String getLogin(String uname,String pass){
        if(uname==null||pass==null){
            return "redirect:/";
        }
            List<Login> log = (List<Login>) rep.findAll();
            int c = 1;
            for (int i = 0; i < log.size(); i++) {
                Login m = log.get(i);
                if (m.getUsername().compareTo(uname) == 0 && m.getPassword().compareTo(pass) == 0) {
                    if(m.getRole().compareTo("user")==0)
                    c=0;
                    else
                    c=2;
                    break;
                }
            }
            if (c==0){
                return "redirect:/home";
            }
            else if(c==2){
                return "redirect:/dash";
            }
            return "redirect:/";
        
    }
    public String add(String username,String password,String role){
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        login.setRole(role);
        rep.save(login);
        return "redirect:/";
    }
}
