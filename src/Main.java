import exeptions.WrongEnterException;
import exeptions.WrongLenghtException;
import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

public class Main {
    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        boolean a = login.length() <= 20;
        System.out.println(a);
        if (login.length() >= 20) {
            throw new WrongLoginException();
        }
        boolean d = login.matches("[a-zA-Z0-9_.]+");
        System.out.println(d);
        if (!login.matches("[a-zA-Z0-9_.]+")) {
            throw new WrongEnterException();
        }

        boolean b = password.length() < 20;
        System.out.println(b);
        if (password.length() > 20) {
            throw new WrongLenghtException();
        }
        boolean p = password.matches("[a-zA-Z0-9_.]+");
        System.out.println(p);
        if (!password.matches("[a-zA-Z0-9_.]+")) {
            throw new WrongEnterException();
        }

        boolean c = confirmPassword.length() == password.length();
        System.out.println(c);
        if (confirmPassword.length() != password.length()) {
            throw new WrongPasswordException();
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            check("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException e) {
            System.out.println("Логин слишком длинный. Максимальная длина логина 20 символов");
        }catch (WrongEnterException e){
            System.out.println("Введен недопустимый символ");
        } catch (WrongLenghtException e) {
            System.out.println("Пароль слишком длинный. Максимальная длина 20 символов");
        } catch (WrongPasswordException e){
            System.out.println("Пароли не совпадают");
        }
    }
}
