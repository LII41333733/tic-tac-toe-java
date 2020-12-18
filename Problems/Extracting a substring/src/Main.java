import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        System.out.println(word.substring(firstDigit, secondDigit + 1));
    }
}