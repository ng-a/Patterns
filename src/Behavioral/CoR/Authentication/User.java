package Behavioral.CoR.Authentication;

public class User extends Authentication{

    @Override
    public boolean checkAuthentication(String login, String password) {
        return false;
    }
}
