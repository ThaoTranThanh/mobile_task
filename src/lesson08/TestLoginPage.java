package lesson08;

public class TestLoginPage {

    public static void main(String[] args) {
        testInternalLoginPage();
        testExternalLoginPage();
        }

    private static void testInternalLoginPage() {
        LoginPage loginPage = new InternalLoginPage();
        loginPage.login();
    }

    private static  void testExternalLoginPage() {
        LoginPage loginPage = new ExternalLoginPage();
        loginPage.login();

    }
}
