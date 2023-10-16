import java.util.Scanner;

public class MaximumOccuring {
    static String removeSpaces(String a) {
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                b = b + a.charAt(i);
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Statement: ");
        String s = sc.nextLine();
        s = removeSpaces(s);
        s = s.toLowerCase();

        int[] count = new int[256]; 
        int maxCount = 0;
        char maxOccurringChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            if (maxCount < count[s.charAt(i)]) {
                maxCount = count[s.charAt(i)];
                maxOccurringChar = s.charAt(i);
            }
        }

        System.out.println("The maximum occurring character is '" + maxOccurringChar + "' with " + maxCount + " occurrences.");
    }
}
