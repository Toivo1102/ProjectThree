package org.itstep.qa.exceptions.homeWork;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array =  new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = scanner.nextInt();

            } catch ( InputMismatchException ex) {
                scanner.nextLine();
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
