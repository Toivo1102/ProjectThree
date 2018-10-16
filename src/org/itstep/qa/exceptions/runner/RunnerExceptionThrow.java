package org.itstep.qa.exceptions.runner;

import org.itstep.qa.exceptions.entity.Cat;
import org.itstep.qa.exceptions.exceptionOne.ColorEyesException;
import org.itstep.qa.exceptions.exceptionOne.CountEyesException;

public class RunnerExceptionThrow {
    public static void main(String[] args) {
        Cat catOne = new Cat(2, "Red");
        catOne.printCountEyes();
        Cat catTwo = new Cat(2, "Yellow");
        catTwo.printCountEyes();

        try {
            Cat catThree = new Cat(2, "Green");
            catThree.printColorEyes();
            Cat catFour = new Cat(2, "Blue");
            catFour.printColorEyes();
        } catch (CountEyesException ex) {
            ex.printStackTrace();
        } catch (ColorEyesException ex) {
            ex.printStackTrace();
        }
    }
}
