import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstInt = scanner.nextInt();
        scanner.nextLine();
        int secondInt = scanner.nextInt();
        scanner.nextLine();
        int thirdInt = scanner.nextInt();
        scanner.nextLine();
        int fourthInt = scanner.nextInt();
        scanner.nextLine();
        int fifthInt = scanner.nextInt();
        scanner.nextLine();
        int sixthInt = scanner.nextInt();
        int secondsPassed1 = firstInt * 3600 + secondInt * 60 + thirdInt;
        int secondsPassed2 = fourthInt * 3600 + fifthInt * 60 + sixthInt;
        System.out.println(secondsPassed2 - secondsPassed1);
    }
}