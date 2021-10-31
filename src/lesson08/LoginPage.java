package lesson08;

public abstract class LoginPage {
    protected  void login(){
        System.out.println("Username selector value: " + usernameSelector());
        System.out.println("Password selector value: " + passwordSelector());
        System.out.println("Login Btn selector value: " + clickOnLoginBtn());
    }

    protected abstract String usernameSelector();
    protected abstract String passwordSelector();
    protected abstract String clickOnLoginBtn();
}
