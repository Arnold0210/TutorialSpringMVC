
package net.codigoalonso.model;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author jaime
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String Email;
    
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDate birthDate;
    private String country;

    public User() {
    }

    public User(int id, String name, String password, String Email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.Email = Email;
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
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + ", Email=" + Email + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
    
    
}
