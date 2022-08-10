package Behavioral.CoR.Authentication;

public abstract class Authentication {
    private Authentication nextCheck;
    protected String login, password;

    public Authentication(){}
    public Authentication(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setNextCheck(Authentication nextCheck){
        this.nextCheck = nextCheck;
    }
    public boolean checkNext(String login, String password) {
        if (nextCheck == null) {
            return false;
        }

        return nextCheck.checkAuthentication(login, password);
    }
    public abstract boolean checkAuthentication(String login, String password);

}
