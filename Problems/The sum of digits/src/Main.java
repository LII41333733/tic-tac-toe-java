import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hundreds = scanner.nextInt(); //476
        int firstVal = hundreds / 100; // 4
        int tens = hundreds - (firstVal * 100); //76
        int secondVal = tens / 10; //7
        int ones = tens - (secondVal * 10); //6
        System.out.println(firstVal + secondVal + ones);
    }
}