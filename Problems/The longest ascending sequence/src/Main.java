import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] compareArray = new int[size];
        scanner.nextLine();
        for (int x = 0; x < size; x++) {
            compareArray[x] = scanner.nextInt();
        }
        int compareLength = compareArray.length;
        int count = 1;
        int finalCount = 1;
        if (compareLength > 1) {
            for (int y = 1; y < compareLength; y++) {
                int holder = compareArray[y - 1];
                int currentVal = compareArray[y];

                if (currentVal > holder) {
                    count++;
                    if (y == compareArray.length - 1 && count > finalCount) {
                        finalCount = count;
                    }
                } else {
                    if (count > finalCount) {
                        finalCount = count;
                        count = 1;
                    }
                }
//            System.out.println(count);
            }
        }
        System.out.println(finalCount);
    }
}