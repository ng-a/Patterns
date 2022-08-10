package Behavioral.CoR.Authentication;

public class CheckPassword extends Authentication{
    private final String password = "root";

    @Override
    public boolean checkAuthentication(String login, String password) {
        if(this.password == password) {
            System.out.println("Password is correct");
            return true;
        }

        else {
            System.out.println("Password is incorrect");
            return false;
        }
    }
}
