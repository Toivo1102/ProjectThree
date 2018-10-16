package org.itstep.qa.exceptions.entity;

import org.itstep.qa.exceptions.exceptionOne.ColorEyesException;
import org.itstep.qa.exceptions.exceptionOne.CountEyesException;

public class Cat {
    private int countEyes;
    private String colorEyes;

    public Cat(int countEyes, String colorEyes) {
        this.countEyes = countEyes;
        this.colorEyes = colorEyes;
    }

    public void printCountEyes() {
        if (countEyes != 2) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println("Количество глаз у котика  = " + countEyes);
    }

    public void printColorEyes() throws ColorEyesException, CountEyesException {
        if (!colorEyes.equals("Green")) {
            throw new ColorEyesException();
        }
        if (countEyes != 2) {
            throw new CountEyesException();
        }
        System.out.println("Цвет глаз у котика  = " + colorEyes);
    }
}

