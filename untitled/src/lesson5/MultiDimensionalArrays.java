package lesson5;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public void createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int[][][] cubeArray = {{{1, 2, 3}, {15, 16, 17}, {21, 51, 3,}}};

        for (int i = 0; i < cubeArray.length; i++) {
            for (int j = 0; j < cubeArray[i].length; j++) {
                for (int h = 0; h < cubeArray[i][j].length; h++) {
                    cubeArray[i][j][h] = cubeArray[i][j][h] + number;
                    System.out.print(cubeArray[i][j][h] + " ");
                }
                System.out.println();
            }
        }
    }
    public void createChessboard() {
        String[][] arrayChessboard = new String[8][8];

        for (int i = 0; i < arrayChessboard.length; i++) {
            for (int j = 0; j < arrayChessboard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arrayChessboard[i][j] = "W";
                    System.out.print(arrayChessboard[i][j] + " ");
                } else {
                    arrayChessboard[i][j] = "B";
                    System.out.print(arrayChessboard[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
