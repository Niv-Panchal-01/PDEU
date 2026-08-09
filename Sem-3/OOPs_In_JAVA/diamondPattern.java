
import java.util.Scanner;

public class diamondPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name to print diamond : ");
        String s = sc.nextLine();
        int len = s.length();

        // Regular Pyramid
        for (int i = 0; i <= len / 2; i++) {
            int k = 0;

            // Left-Half of pyramid
            for (int j = 0; j <= len / 2; j++) {
                if (j >= len / 2 - i) {
                    System.out.print(s.charAt(k) + " ");
                    k++;
                } else {
                    System.out.print("  ");
                }
            }

            // Right-Half of pyramid
            for (int j = len / 2 + 1; j < len; j++) {
                if (j <= len / 2 + i) {
                    System.out.print(s.charAt(k) + " ");
                    k++;
                }
            }

            System.out.println();
        }

        // Inverted Pyramid
        for (int i = 0; i <= len / 2; i++) {
            int k = 0;

            // Left-Half of pyramid
            for (int j = 0; j <= len / 2; j++) {
                if (j >= i) {
                    System.out.print(s.charAt(k) + " ");
                    k++;
                } else {
                    System.out.print("  ");
                }
            }

            // Right-Half of pyramid
            for (int j = len / 2 + 1; j < len; j++) {
                if (j < len - i) {
                    System.out.print(s.charAt(k) + " ");
                    k++;
                }
            }

            System.out.println();
        }
    }
}
