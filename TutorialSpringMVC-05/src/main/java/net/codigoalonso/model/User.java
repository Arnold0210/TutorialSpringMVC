
package net.codigoalonso.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author jaime
 */
public class User {
    //@Min(1)
    //@Max(10)
    @Range(min=1,max=10)
    private int id;    
    @Size(min=4, max=10)
    private String name;
    @Size(min=6)
    private String password;
    
    //@Email    
    @Pattern(regexp = "^[\\w-_\\.+]*[\\w-_\\.]\\ @([\\w]+\\.)+[\\w]+[\\w]$")        
    private String email;
    @NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy")    
    private LocalDate birthDate;    
    @NotNull
    private String country;

    public User() {
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + ", Email=" + email + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
    
    
}
