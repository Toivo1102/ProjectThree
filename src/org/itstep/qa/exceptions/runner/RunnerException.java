package org.itstep.qa.exceptions.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerException {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int result = -1;
        try {
            result = scanner.nextInt();
            System.out.println("Код который идет после ввода");
            int [] array = new int[3];
            array [3] = result;
        } catch (InputMismatchException ex) {
            System.out.println("Сработала секция catch для InputMismatchException");
            ex.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Сработала секция catch для ArrayIndexOutOfBoundsException");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Сработала секция finally");
        }
        System.out.println("Вы ввели: " + result);
        //  здесь еще может быть 100500 строчек кода,
        // которые не отработают, все что ниже ошибки не отрабатывают
    }
}
