package org.itstep.qa.exceptions.homeWork;

public class Triangle {
    /*
    Решить задачу об определении площади треугольника по трем сторонам.
    Длины сторон вводить с клавиатуры. Проверку корректности ввода реализовать
    через обработку исключений. Проверку корректности длин сторон организовать
    через обработку исключений. (Выбросить собственное исключение).
     */

    private int a;
    private int b;
    private double c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void printSquare() throws LengthException {
        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            throw new LengthException();
        }
        System.out.println("Площадь треугольника равна: " + Math.sqrt(((a + b + c) / 2) *
                    (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) *
                    (((a + b + c) / 2) - c)));

    }
}
