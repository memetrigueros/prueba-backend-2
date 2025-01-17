import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra o frase: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" si es un palíndromo.");
        } else {
            System.out.println("\"" + input + "\" no es un palíndromo.");
        }
        scanner.close();
    }
}
