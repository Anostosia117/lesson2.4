import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        boolean a = login.length() <=20;
        System.out.println(a);
        for (int i = 0; i < login.length(); i++) {
            if (login.length() >= 20) {
                try {
                    throw new WrongLoginException();
                } catch (WrongLoginException e) {
                    System.out.println("Логин слишком длинный. Максимальная длина логина 20 символов");
                } break;
            }

            }

        boolean b = password.length() <20;
        System.out.println(b);
        for (int i = 0; i < password.length(); i++) {
            if (password.length() > 20) {
                try {
                    throw new WrongPasswordException();
                } catch (WrongPasswordException e) {
                    System.out.println("Пароль слишком длинный. Максимальная длина пароля 20 символов");

                } break;
            }
        }
        boolean c = confirmPassword.length()==password.length();
        System.out.println(c);
        for (int i = 0; i < confirmPassword.length(); i++) {
            if (confirmPassword.length()!=password.length()) {
                try {
                    throw new WrongPasswordException();
                } catch (WrongPasswordException e) {
                    System.out.println("Пароли не совпадают");

                }break;
            }
        }
        return true;
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        check("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }
}
