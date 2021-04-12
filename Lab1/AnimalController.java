package com.java.Controller;

import com.java.View.*;
import com.java.Model.Methods;

public class AnimalController {
    private AnimalView animalView = new AnimalView();
    private Methods methods = new Methods();

    public void start() {

        animalView.printMenu();
        while (true) {
            switch (InputUtility.numberForMenu(animalView)) {
                case 1: {
                    animalView.printArray(methods.getAnimal());
                    break;
                }
                case 2: {
                    animalView.printMessage(AnimalView.ENTER_AGE);
                    int morThanAge = InputUtility.numberForMorThanAge();
                    animalView.printArray(methods.funcMorThanAge(morThanAge));
                    break;
                }
                case 3: {
                    animalView.printMessage(AnimalView.ENTER_FAM);
                    String fam = InputUtility.familyForFunc();
                    animalView.printArray(methods.funcForEqualFamily(fam));
                    break;
                }
                case 4: {
                    animalView.printMessage(AnimalView.ENTER_SP_AND_COL);
                    String[] str;
                    str = InputUtility.speciesAndColorForFunc();
                    animalView.printArray(methods.funcForEqualSpeciesAndColor(str[0], str[1]));
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
            animalView.printMenu();
        }
    }
}
