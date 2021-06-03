package Controller;

import Model.Animal;
import View.*;
import Model.Methods;
import Exception.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.InputMismatchException;

public class AnimalController {
    private AnimalView animalView = new AnimalView();
    private Methods methods;
    private final Logger logger = LogManager.getLogger(AnimalController.class);

    public AnimalController() {
        try {
            methods = new Methods();
        } catch (IOException e) {
            animalView.printMessage("Помилка читання файлу");
            logger.error("Помилка читання файлу");
            System.exit(0);
        }
    }

    public void start() {
        logger.info("App started");
        animalView.printMenu();
        while (true) {
            try {
                switch (InputUtility.numberForMenu()) {
                    case 1: {
                        animalView.printArray(methods.getAnimal());
                        logger.info("case 1 finished");
                        break;
                    }
                    case 2: {
                        funcForCase2();
                        logger.info("case 2 finished");
                        break;
                    }
                    case 3: {
                        funcForCase3();
                        logger.info("case 3 finished");
                        break;
                    }
                    case 4: {
                        funcForCase4();
                        logger.info("case 4 finished");
                        break;
                    }
                    case 5: {
                        logger.info("App finished");
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException e) {
                animalView.printMessage(AnimalView.ERR_NUMBER);
                logger.error(AnimalView.ERR_NUMBER);
            }
            animalView.printMenu();
        }
    }

    public void funcForCase2() {
        try {
            Animal[] temp;
            animalView.printMessage(AnimalView.ENTER_AGE);
            int morThanAge = InputUtility.numberForMorThanAge();
            Validator.lessThanZero(morThanAge);
            temp = methods.funcMorThanAge(morThanAge);
            animalView.printArray(temp);
            if (temp.length>0){
                try {
                    methods.question(temp);
                    animalView.printMessage("Операція пройшла успішно");
                } catch (IOException e) {
                    animalView.printMessage("Помилка збереження в файл");
                }
            }
        } catch (InputIntException e) {
            animalView.printMessage(e.getMessage());
        }
    }

    public void funcForCase3() {
        try {
            Animal[] temp;
            animalView.printMessage(AnimalView.ENTER_FAM);
            String fam = InputUtility.familyForFunc();
            Validator.noNumber(fam);
            temp = methods.funcForEqualFamily(fam);
            animalView.printArray(temp);
            if(temp.length>0){
                try {
                    methods.question(temp);
                    animalView.printMessage("Операція пройшла успішно");
                } catch (IOException e) {
                    animalView.printMessage("Помилка збереження в файл");
                }
            }
        } catch (InputStringException e) {
            animalView.printMessage(e.getMessage());
        }
    }

    public void funcForCase4() {
        try {
            Animal[] temp;
            animalView.printMessage(AnimalView.ENTER_SP_AND_COL);
            String[] str;
            str = InputUtility.speciesAndColorForFunc();
            Validator.noNumber(str[0]);
            Validator.noNumber(str[1]);
            temp = methods.funcForEqualSpeciesAndColor(str[0], str[1]);
            animalView.printArray(temp);
            if(temp.length>0){
                try {
                    methods.question(temp);
                    animalView.printMessage("Операція пройшла успішно");
                } catch (IOException e) {
                    animalView.printMessage("Помилка збереження в файл");
                }
            }
        } catch (InputStringException e) {
            animalView.printMessage(e.getMessage());
        }
    }
}
