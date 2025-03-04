package basic.oop.homework.encapquiz;

public class PasswordManager {

    private String password;

    PasswordManager(String password){
       this.password = password;
    };

    boolean changePassword(String old, String newp){
        if(!old.equals(newp)){
            this.password = newp;
            return true;
        }else{
            return false;
        }

    };



}
