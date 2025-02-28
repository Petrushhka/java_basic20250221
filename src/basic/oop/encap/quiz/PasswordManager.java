package basic.oop.encap.quiz;

public class PasswordManager {

    private int password;


    public void setPassword1(int password){
        this.password = password;
    }

    public void setPassword2(int nowPassword, int cPassword){
        if(this.password != nowPassword){
            System.out.println("불일치");
            return;
        }else if(this.password == nowPassword){
            this.password = cPassword;
            System.out.println("변경완료");
            return;
        }
    }

}
