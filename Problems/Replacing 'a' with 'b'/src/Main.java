import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String newString = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a') {
                newString = newString.concat("b");
            } else {
                newString = newString.concat(String.valueOf(c));
            }
        }
        System.out.println(newString);
    }
}
