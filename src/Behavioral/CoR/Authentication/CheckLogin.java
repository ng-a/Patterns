package Behavioral.CoR.Authentication;

public class CheckLogin extends Authentication {
    private final String login = "admin";

    @Override
    public boolean checkAuthentication(String login, String password) {
        if(this.login == login) {
            System.out.println("Login exists");
            return true;
        }

        else {
            System.out.println("Login not found");
            return false;
        }
    }
}
