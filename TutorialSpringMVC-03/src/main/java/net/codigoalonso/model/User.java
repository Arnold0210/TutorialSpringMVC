/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codigoalonso.model;

/**
 *
 * @author jaime
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String Email;

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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + ", Email=" + Email + '}';
    }
    
    
    
    
}
