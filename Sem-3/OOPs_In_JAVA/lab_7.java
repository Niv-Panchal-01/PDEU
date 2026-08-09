
import java.util.Scanner;

public class lab_7 {

    public static void main(String args[]) {
        System.out.println("write 'quite' to end up inputs.");
        Scanner sc = new Scanner(System.in);
        int countVowels = 0;

        while (true) {
            System.out.print("Enter a sentence : ");
            String s = sc.nextLine().toLowerCase();

            if (s.equals("quit")) {
                System.out.println("input loop is closing...");
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                            || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                        countVowels++;
                    }
                }
            }
        }

        System.out.println("Your total count of vowels in each sentences is : " + countVowels);
    }
}
