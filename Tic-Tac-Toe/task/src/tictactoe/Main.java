package tictactoe;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "_________";
        boolean turnCompleted = false;
        boolean gameWon = false;
        int turnIndex = 1;

        char letter_1 = pattern.charAt(0);
        char letter_2 = pattern.charAt(1);
        char letter_3 = pattern.charAt(2);
        char letter_4 = pattern.charAt(3);
        char letter_5 = pattern.charAt(4);
        char letter_6 = pattern.charAt(5);
        char letter_7 = pattern.charAt(6);
        char letter_8 = pattern.charAt(7);
        char letter_9 = pattern.charAt(8);

        String divider = "---------";
        System.out.println(divider);
        System.out.println("| " + letter_1 + " " + letter_2 + " " + letter_3 + " |");
        System.out.println("| " + letter_4 + " " + letter_5 + " " + letter_6 + " |");
        System.out.println("| " + letter_7 + " " + letter_8 + " " + letter_9 + " |");
        System.out.println(divider);

        int[][] grid = {
                {1, 1},
                {1, 2},
                {1, 3},
                {2, 1},
                {2, 2},
                {2, 3},
                {3, 1},
                {3, 2},
                {3, 3}
        };

        int coordinate = -1;
        boolean oThreeInARow = false;
        boolean xThreeInARow = false;

        int[] xChecker = new int[3];
        int[] oChecker = new int[3];
        Arrays.fill(xChecker, 0, 3, -1);
        Arrays.fill(oChecker, 0, 3, -1);

        int[][] winnerIndexes = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6},
        };

        while (!gameWon) {
            turnCompleted = false;
            while (!turnCompleted) {
                String cdn1String = scanner.next();
                String cdn2String = scanner.next();

                int cdn1Int = Integer.parseInt(cdn1String);
                int cdn2Int = Integer.parseInt(cdn2String);

                int[] coordinateArray = new int[]{cdn1Int, cdn2Int};

                System.out.println("Enter coordinates: " + cdn1Int + " " + cdn2Int);

                boolean validationCheckCdn1 = false;
                boolean validationCheckCdn2 = false;

                int[] checkNumbers = new int[]{1, 2, 3};

                for (int i = 0; i < checkNumbers.length; i++) {
                    validationCheckCdn1 = checkNumbers[i] == cdn1Int;
                    if (validationCheckCdn1) {
                        break;
                    }
                }
                for (int i = 0; i < checkNumbers.length; i++) {
                    validationCheckCdn2 = checkNumbers[i] == cdn2Int;
                    if (validationCheckCdn2) {
                        break;
                    }
                }

                if (!validationCheckCdn1 || !validationCheckCdn2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    for (int i = 0; i < grid.length; i++) {
                        if (Arrays.equals(coordinateArray, grid[i])) {
                            coordinate = i;
                        }
                    }

                    char charMatch = pattern.charAt(coordinate);
                    char whichChar = turnIndex % 2 == 0 ? 'O' : 'X';
                    if (charMatch == '_') {
                        String patternAfterInput = "";
                        for (int i = 0; i < pattern.length(); i++) {
                            if (i != coordinate) {
                                patternAfterInput += pattern.charAt(i);
                            } else {
                                patternAfterInput += whichChar;
                            }
                        }

                        char letterAfter_1 = patternAfterInput.charAt(0);
                        char letterAfter_2 = patternAfterInput.charAt(1);
                        char letterAfter_3 = patternAfterInput.charAt(2);
                        char letterAfter_4 = patternAfterInput.charAt(3);
                        char letterAfter_5 = patternAfterInput.charAt(4);
                        char letterAfter_6 = patternAfterInput.charAt(5);
                        char letterAfter_7 = patternAfterInput.charAt(6);
                        char letterAfter_8 = patternAfterInput.charAt(7);
                        char letterAfter_9 = patternAfterInput.charAt(8);

                        System.out.println(divider);
                        System.out.println("| " + letterAfter_1 + " " + letterAfter_2 + " " + letterAfter_3 + " |");
                        System.out.println("| " + letterAfter_4 + " " + letterAfter_5 + " " + letterAfter_6 + " |");
                        System.out.println("| " + letterAfter_7 + " " + letterAfter_8 + " " + letterAfter_9 + " |");
                        System.out.println(divider);

                        int xCount = 0;
                        int oCount = 0;
                        int[] xPositions = new int[9];
                        int[] oPositions = new int[9];

                        Arrays.fill(xPositions, 0, 9, -1);
                        Arrays.fill(oPositions, 0, 9, -1);

                        for (int i = 0; i < patternAfterInput.length(); i++) {
                            char x = patternAfterInput.charAt(i);
                            switch (x) {
                                case 'X':
                                    xCount++;
                                    xPositions[i] = i;
                                    break;
                                case 'O':
                                    oCount++;
                                    oPositions[i] = i;
                                    break;
                            }
                        }

                        for (int j = 0; j < winnerIndexes.length; j++) {
                            for (int r = 0; r < winnerIndexes[j].length; r++) {
                                for (int i = 0; i < pattern.length(); i++) {
                                    if (xPositions[i] == winnerIndexes[j][r]) {
                                        xChecker[r] = winnerIndexes[j][r];
                                    }
                                    if (oPositions[i] == winnerIndexes[j][r]) {
                                        oChecker[r] = winnerIndexes[j][r];
                                    }
                                    if (Arrays.equals(xChecker, winnerIndexes[j])) {
                                        xThreeInARow = true;
                                    }

                                    if (Arrays.equals(oChecker, winnerIndexes[j])) {
                                        oThreeInARow = true;
                                    }
                                }
                            }
                        }

                        boolean noWinner = !oThreeInARow && !xThreeInARow;
                        boolean twoWinners = oThreeInARow && xThreeInARow;

                        if (xCount - oCount >= 2 || oCount - xCount >= 2 || twoWinners) {
                            System.out.println("Impossible");
                        } else {
                            if (noWinner) {
                                if (xCount + oCount == 9) {
                                    System.out.println("Draw");
                                    gameWon = true;
                                }
                            } else {
                                if (oThreeInARow) {
                                    System.out.println("O wins");
                                } else {
                                    System.out.println("X wins");
                                }
                                gameWon = true;
                            }
                        }
                        turnCompleted = true;
                        turnIndex++;
                        pattern = patternAfterInput;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                }
            }
        }
    }
}