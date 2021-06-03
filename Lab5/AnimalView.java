package View;

import Model.Animal;

public class AnimalView {
    public static final String ENTER_AGE = "Введіть вік ";
    public static final String RESULT = "Пошук не дав результату";
    public static final String ENTER_FAM = "Введіть назву сімейства ";
    public static final String ENTER_SP_AND_COL = "Введіть вид та окрас ";
    public static final String ERR_NUMBER = "Потрібно вводити тільки числа ";
    public static final String ERR_NUMB_FOR_MENU = "Потрібно вводити числа від 1 до 5 Повторіть:";

    public void printMenu() {
        System.out.println("1 щоб отримати весь список");
        System.out.println("2 щоб отримати список тварин старше заданого віку");
        System.out.println("3 щоб отримати список тварин заданого сімейства");
        System.out.println("4 щоб отримати список тварин заданого виду і окрасу");
        System.out.println("5 завершити роботу");
        System.out.println("Введіть значення для роботи: ");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printArray(Animal[] animal) {
        Animal[] temp = new Animal[animal.length];
        System.arraycopy(animal, 0, temp, 0, animal.length);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        if (temp.length == 0) {
            System.out.println(RESULT);
        }
    }
}
