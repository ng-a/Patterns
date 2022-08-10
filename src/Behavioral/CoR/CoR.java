package Behavioral.CoR;

import Behavioral.CoR.Authentication.*;

public class CoR {
    public static void main(String[] args) {
        Authentication user = new User();

        user.setNextCheck(new CheckLogin());
        user.checkNext("admin", "root");

        user.setNextCheck(new CheckPassword());
        user.checkNext("admin", "root");
    }
}
