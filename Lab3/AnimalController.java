package Controller;

import View.*;
import Model.Methods;
import Exception.*;

import java.util.InputMismatchException;

public class AnimalController {
    private AnimalView animalView = new AnimalView();
    private Methods methods = new Methods();

    public void start() {
        animalView.printMenu();
        while (true) {
            try {
                switch (InputUtility.numberForMenu()) {
                    case 1: {
                        animalView.printArray(methods.getAnimal());
                        break;
                    }
                    case 2: {
                        try {
                            animalView.printMessage(AnimalView.ENTER_AGE);
                            int morThanAge = InputUtility.numberForMorThanAge();
                            Validator.lessThanZero(morThanAge);
                            animalView.printArray(methods.funcMorThanAge(morThanAge));
                            methods.question(methods.funcMorThanAge(morThanAge));
                        } catch (InputIntException e) {
                            animalView.printMessage(e.getMessage());
                        }
                        break;
                    }
                    case 3: {
                        try {
                            animalView.printMessage(AnimalView.ENTER_FAM);
                            String fam = InputUtility.familyForFunc();
                            Validator.noNumber(fam);
                            animalView.printArray(methods.funcForEqualFamily(fam));
                            methods.question(methods.funcForEqualFamily(fam));
                        } catch (InputStringException e) {
                            animalView.printMessage(e.getMessage());
                        }
                        break;
                    }
                    case 4: {
                        try {
                            animalView.printMessage(AnimalView.ENTER_SP_AND_COL);
                            String[] str;
                            str = InputUtility.speciesAndColorForFunc();
                            Validator.noNumber(str[0]);
                            Validator.noNumber(str[1]);
                            animalView.printArray(methods.funcForEqualSpeciesAndColor(str[0], str[1]));
                        } catch (InputStringException e) {
                            animalView.printMessage(e.getMessage());
                        }
                        break;
                    }
                    case 5: {
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException e) {
                animalView.printMessage(AnimalView.ERR_NUMBER);
            }
            animalView.printMenu();
        }
    }
}
