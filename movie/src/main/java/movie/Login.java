package movie;
import jakarta.persistence.*;

@Entity
@Table(name ="login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 225,name = "username")
    private String username;
    @Column(length = 120)
    private String password;
    @Column(length = 10)
    private String role;

    public Integer getId(){
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role=role;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
