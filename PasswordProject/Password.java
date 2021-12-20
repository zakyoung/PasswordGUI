/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zak
 */
public class Password {
    private String password;
    public Password(){
        this.password = "";
    }
    public Password(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int passwordLength(){
        return password.length();
    }
}
