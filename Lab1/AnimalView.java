package com.java.View;

public class AnimalView {
    public void messageForFuncMorThanAge(){
        System.out.println("Немає тварин старше заданого віку");
    }
    public void messageForFuncEqualsFamily(){
        System.out.println("Немає тварин заданого сімейства");
    }
    public void messageForFuncEqualSpeciesAndColor(){
        System.out.println("Немає тварин заданого виду та окрасу");
    }
    public void printMenu(){
        System.out.println("1 щоб отримати весь список");
        System.out.println("2 щоб отримати список тварин старше заданого віку");
        System.out.println("3 щоб отримати список тварин заданого сімейства");
        System.out.println("4 щоб отримати список тварин заданого виду і окрасу");
        System.out.println("5 завершити роботу");
        System.out.print("Введіть значення для роботи: ");
    }
    public void errorMessage(){
        System.out.println("Помилка! Введіть потрібне значення ще раз");
    }
    public void messageForCase2(){
        System.out.println("Введіть вік");
    }
    public void messageForCase3(){
        System.out.println("Введіть назву сімейства");
    }
    public void messageForCase4(){
        System.out.println("Введіть вид та назву сімейства");
    }
    public void message(){
        System.out.print("Введіть значення для роботи: ");
    }
}
