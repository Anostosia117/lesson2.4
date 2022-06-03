import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        boolean a = login.length() <= 20;
          System.out.println(a);
        for (int i = 0; i < login.length(); i++) {
            if (login.length() >= 20) {
                throw new WrongLoginException();
            }
            if (!login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException();
            }
            return true;
        }
            boolean b = password.length() < 20;
            System.out.println(b);
            for (int i = 0; i < password.length(); i++) {
                if (password.length() > 20) {
                    throw new WrongPasswordException();
                }
                if (!password.matches("[a-zA-Z0-9_]+")) {
                    throw new WrongPasswordException();
                }
                return true;

            }
            boolean c = confirmPassword.length() == password.length();
            System.out.println(c);
            for (int i = 0; i < confirmPassword.length(); i++) {
                if (confirmPassword.length() != password.length()) {
                    throw new WrongPasswordException();
                }
            }
         return true;
        }

    public static void main(String[] args){
        try {
            check("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException e) {
            System.out.println("Логин слишком длинный. Максимальная длина логина 20 символов");
            System.out.println("Логин содержит недопустимые символы");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль содержит недопустимые символы");
            System.out.println("Пароли не совпадают");
        }
    }
}
