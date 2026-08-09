
import java.util.Scanner;

public class lab_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String s = sc.nextLine();
        int len = s.length();
        int endRow = len / 2;

        for (int i = 0; i < endRow + 1; i++) {
            int k = 0;
            for (int j = 0; j <= endRow; j++) {
                if (j >= endRow - i) {
                    System.out.print(s.charAt(k) + " ");
                    k++;
                } else {
                    System.out.print("  ");
                }
            }
            for (int n = endRow + 1; n < len; n++) {
                if (n <= endRow + i) {
                    System.out.print(s.charAt(k) + " ");
                    k++;
                }

            }
            System.out.println();
        }
    }
}
