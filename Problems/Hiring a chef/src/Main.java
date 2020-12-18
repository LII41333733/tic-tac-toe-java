//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String word3 = scanner.nextLine();
        System.out.println("The form for " + word1 +
                " is completed. We will contact you if we need a chef that cooks " + word3 + " dishes.");
    }
}
