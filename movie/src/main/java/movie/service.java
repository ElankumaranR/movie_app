package movie;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;
@Service
public class service {
    @Autowired private repository rep;
    public String getLogin(String email,String pass){
        if(email==null||pass==null){
            return "home";
        }
        else if (rep != null){
            List<Login> log = (List<Login>) rep.findAll();
            int c = 1;
            for (int i = 0; i < log.size(); i++) {
                Login m = log.get(i);
                if (m.getUsername().compareTo(email) == 0 && m.getPassword().compareTo(pass) == 0) {
                    c = 0;
                    break;
                }
            }
            if (c==0){
                return "redirect:/home";
            } else {
                return "redirect:/";
            }
        }
        else{
            return "login";
        }
    }
}
