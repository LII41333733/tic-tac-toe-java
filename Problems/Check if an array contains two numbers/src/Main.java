import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        boolean bool = false;
        int[] newArray = new int[size];
        for (int y = 0; y < size; y++) {
            newArray[y] = scanner.nextInt();
        }
        scanner.nextLine();
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        for (int m = 0; m < size - 1; m++) {
            int mPlus = m + 1;
            if (
                (newArray[m] == v || newArray[m] == n) && (newArray[mPlus] == v || newArray[mPlus] == n)
            ) {
                bool = true;
                break;
            }
        }
        System.out.println(bool);
    }
}
