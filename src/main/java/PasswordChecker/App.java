package PasswordChecker;
import java.util.Scanner;

/**
 * Created by kallamarciniak on 04.03.2018.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello, let's check if your password is strong!\n"
            + "To be strong your password need to have:\n"
            + "1. At lest 6 signs\n"
            + "2. Have small and capital letters\n"
            + "3. At least one number\n"
            + "4. At least one special character: “!”, “@”, “#”, “$” or “_”\n");
        Scanner scan = new Scanner(System.in);
            String password = scan.next();
            if (!checkingFUCNTION(password)) {
                System.out.println("Your password is not strong.");
            } else
                System.out.println("Good job! Your password is strong.");
    }


    private static boolean specialCHAR(String password) {
        boolean charISspecial = false;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '!'
                || password.charAt(i) == '@'
                || password.charAt(i) == '#'
                || password.charAt(i) == '$'
                || password.charAt(i) == '_') {

                charISspecial = true;
            }
        }
        return charISspecial;
    }

    private static boolean isTHEREnumber(String password) {
        boolean numberISthere = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberISthere = true;
            }
        }
        return numberISthere;
    }

    private static boolean smallandBIG(String password) {
        boolean checkIFthereISsmall = false;
        boolean checkIFthereISbig = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                checkIFthereISbig = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                checkIFthereISsmall = true;
            }
        }

        return checkIFthereISbig && checkIFthereISsmall;
    }

    private static boolean checkIFatLEAST6(String password) {
        return password.length() >= 6;
    }

    static boolean checkingFUCNTION(String password) {
        return checkIFatLEAST6(password) && smallandBIG(password)
            && isTHEREnumber(password) && specialCHAR(password);
    }

}


