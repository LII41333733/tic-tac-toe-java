import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longString =
            scanner.nextLine() +
            scanner.nextLine() +
            scanner.nextLine() +
            scanner.nextLine();
        Boolean isPretty = true;
        for (int i = 0; i < longString.length() - 5; i++) {
            char check = longString.charAt(i);
            char checkAgainst = longString.charAt(i + 1);
            if (16 % (i + 1) == 0 && i > 2) {
                continue;
            }

            if (check == checkAgainst &&
                    longString.charAt(i + 4) == check &&
                    longString.charAt(i + 5) == check
            ) {
                isPretty = false;
            }
        }
        System.out.println(isPretty ? "YES" : "NO");
    }

}