import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        scanner.nextLine();
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        int holder = 0;
        for (int x = 1; x <= h; x++) {
            int m = holder + a;
            boolean reachedTop = h <= m;
            if (reachedTop) {
                System.out.println(x);
                break;
            } else {
                holder = m - b;
            }
        }
    }
}
/*
----------
3 = 9 5 3
2 = 12 8 1
8 = 10 3 2
 */