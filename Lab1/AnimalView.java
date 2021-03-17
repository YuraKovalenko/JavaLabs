package com.java.View;

public class AnimalView {
    public void printMenu(){
        System.out.println("1 щоб отримати весь список");
        System.out.println("2 щоб отримати список тварин старше заданого віку");
        System.out.println("3 щоб отримати список тварин заданого сімейства");
        System.out.println("4 щоб отримати список тварин заданого виду і окрасу");
        System.out.println("5 завершити роботу");
    }
    public void errorMessage(){
        System.out.println("ПОМИЛКА!!!");
    }
    public void messageForTask1(){
        System.out.println("введіть вік");
    }
    public void messageForTask2(){
        System.out.println("введіть назву сімейства");
    }
    public void messageForTask3(){
        System.out.println("введіть вид та окрас");
    }
    public void emptyMessage(){
        System.out.println("Пусто");
    }
}
