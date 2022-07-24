package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArrays {
    Scanner scanner = new Scanner(System.in);
    public void findNumberArray() {
        System.out.println("Загадайте число");
        int value = scanner.nextInt();
        int[] array = {55, 25, 14, 2, 15, 100, 85};
        System.out.println(Arrays.toString(array));

        for (int index = 0; index < array.length; index++) {
            if (value == array[index]) {
                System.out.println("Число входит в состав массива");
            }
        }
    }
    public void deleteElement() {
        System.out.println("Загадайте число");
        int value = scanner.nextInt();
        int[] array = {1, 2, 3, 5};
        int[] newArray = new int[array.length];

        if (value > 5 || value <= 0) {
            System.out.println("Числа нет в массиве");
            return;
        } else {
            int size = array.length;
            int i;
            for (i = 0; i < size; i++) {
                if (array[i] != value) {
                    newArray[i] = array[i];
                }else {
                    for (int k = i; k < size - 1; k++) {
                        newArray[k] = array[k + 1];
                    }
                    size--;
                    break;
                }
            }
            for (i = 0; i < size; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
    public void enterRandomNumbers () {
        System.out.println("Введите случайное число");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * sizeArray);
            sum += array[i];
            average = (double) sum / array.length;
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Среднее значение: " + average);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
    public void createTwoArrays () {
        int [] firstArray= {1, 2, 10, 15, 0};
        int [] secondArray = {5, 6, 7, 4, 2};
        int sumFirstArray = 0;
        int sumSecondArray = 0;
        double averageFirstArray = 0;
        double averageSecondArray = 0;
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        for (int i = 0; i < firstArray.length; i++) {
            sumFirstArray += firstArray[i];
            averageFirstArray = (double) sumFirstArray / firstArray.length;
        }
        System.out.println("Среднее значение первого массива: " + averageFirstArray);

        for (int i = 0; i < secondArray.length; i++) {
            sumSecondArray += secondArray[i];
            averageSecondArray = (double) sumSecondArray / secondArray.length;
        }
        System.out.println("Среднее значение второго массива: " + averageSecondArray);

        if (averageFirstArray > averageSecondArray){
            System.out.println("Среднее значение первого массива больше");
        } else if (averageFirstArray < averageSecondArray){
            System.out.println("Среднее значение второго массива");
        } else if (averageFirstArray == averageSecondArray){
            System.out.println("Среднее значение масивов равны");
        }
    }

    public void realiseBubbleSort() {
        int[] array = {5, 6, 1, 3, 2};
        int archive;

        for (int i = 0; i < array.length - 1; i++) {
            for ( int j = 0; j < array.length - 1; j++) {
                if ( array[j] > array[j + 1]) {
                    archive = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = archive;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void replaceWithZero () {
        int[] array = { 5, 7, 8, 17, 33};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if ( i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
