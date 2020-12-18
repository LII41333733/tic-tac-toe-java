import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        int[] newArray = new int[size];
        for (int y = 0; y < size; y++) {
            newArray[y] = scanner.nextInt();
        }
        scanner.nextLine();
        int n = scanner.nextInt();
        for (int m = 0; m < size; m++) {
            if (newArray[m] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}