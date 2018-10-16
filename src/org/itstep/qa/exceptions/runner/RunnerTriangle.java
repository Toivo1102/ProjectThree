package org.itstep.qa.exceptions.runner;

import org.itstep.qa.exceptions.homeWork.LengthException;
import org.itstep.qa.exceptions.homeWork.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        int a;
        int b;
        double c;
        System.out.println("Введите стороны треугольника");
        try {
            triangle.setA(scanner.nextInt());
            triangle.setB(scanner.nextInt());
            triangle.setC(scanner.nextDouble());
            triangle.printSquare();
        } catch ( LengthException ex ) {
            System.out.println("Неправильные длины сторон треугольника");
        }

    }
}
