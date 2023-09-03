import java.util.HashMap;
public class main {
    public static void main(String[] args) {
        IdandPasswords idandPasswords = new IdandPasswords();

        LoginPage loginpage = new LoginPage(idandPasswords.getLoginInfo());
    }
}
