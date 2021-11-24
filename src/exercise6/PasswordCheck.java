package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
      boolean passValid = false;
      do {
        System.out.println("Enter password: ");
        String password = input.nextLine();
        if (password.length() < 8) {
          continue;
        }

        boolean allLettersAndDigits = true;
        int digitCount = 0;
        for(int index = 0; index < password.length(); index++) {
          char symbol = password.charAt(index);
          boolean LetterOrDigit = Character.isLetterOrDigit(symbol);
          if (!LetterOrDigit) {
            allLettersAndDigits = false;
            break;
          }
          boolean digit = Character.isDigit(symbol);
          if(digit) {
            digitCount++;
          }
        }
        if (allLettersAndDigits && digitCount >= 2) {
          passValid = true;
        }
      } while (!passValid);
      System.out.println("Password valid!");
    }
}
