package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                new int[3],
                new int[5],
                new int[7],
                new int[8],
                new int[9]
        };

        Random rand = new Random();
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = rand.nextInt(51) + 50;
            }
        }

        System.out.println("Несортированный массив:");
        printJaggedArray(jaggedArray);

        for (int i = 0; i < jaggedArray.length; i++) {
            Arrays.sort(jaggedArray[i]);
        }

        System.out.println("Отсортированный массив:");
        printJaggedArray(jaggedArray);
    }

    public static void printJaggedArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
