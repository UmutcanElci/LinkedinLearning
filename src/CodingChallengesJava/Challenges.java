package CodingChallengesJava;

import java.util.Scanner;

public class Challenges {
    public static boolean isEven(int n){
        return n % 2 == 0;

        /*
        if (n % 2 == 0){
            return true;
        }else {
            return false;
        }

         */
    }

    public static boolean isPasswordComplex(String password){
        /*
        Must have at least six characters
        Must have one uppercase letter
        Must have one lowercase letter
        Must have one number
         */
        /*
        if (password.length()<6){
            return false;
        }
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i<password.length() || !hasLowercaseLetter && !hasUppercaseLetter && ! hasNumber; i++){
            char current = password.charAt(i);
            if (Character.isDigit(current)){
                hasNumber = true;
            }else if(Character.isUpperCase(current)){
                hasUppercaseLetter = true;
            } else if (Character.isLowerCase(current)) {
                hasLowercaseLetter = true;
            }
        }
        return hasNumber && hasLowercaseLetter && hasUppercaseLetter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

*/
        //With regEx
        return password.length() >= 6
                && password.matches(".*\\d.*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z.*]");
       }
    }




