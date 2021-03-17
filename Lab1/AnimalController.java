package com.java.controller;

import com.java.View.AnimalView;
import com.java.model.Animal;
import com.java.methods.Methods;

import java.util.Scanner;

public class AnimalController {
    private Animal[]animal = new Animal[10];
    private AnimalView animalView = new AnimalView();
    private Methods methods = new Methods();
    private int inputNumber;
    public void go(){
        animalView.printMenu();
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        while (inputNumber!=5){
            methods.create();
            switch (inputNumber){
                case 1:{
                    methods.task();
                    animalView.printMenu();
                    break;
                }
                case 2:{
                    animalView.messageForTask1();
                    int age = scanner.nextInt();
                    if(age<10 || age>20){
                        animalView.errorMessage();
                    }
                    methods.setMorThanAge(age);
                    methods.task1();
                    animalView.printMenu();
                    break;
                }
                case 3:{
                    animalView.messageForTask2();
                    String fam = scanner.next();
                    if ("cow".equals(fam) || "dog".equals(fam) || "cat".equals(fam)) {

                    }
                    else {
                        animalView.errorMessage();
                    }

                    methods.setFam(fam.toString());
                    System.out.println("====");
                    methods.task2();
                    System.out.println("====");
                    animalView.printMenu();
                    break;
                }
                case 4:{
                    animalView.messageForTask3();
                    String sp = scanner.next(), col = scanner.next();
                    if (sp.equals("sp1") || sp.equals("sp2") || sp.equals("sp3")){

                    }
                    else {
                        animalView.errorMessage();
                    }
                    if (col.equals("blue") || col.equals("red") || col.equals("green") || col.equals("yellow")){

                    }
                    else {
                        animalView.errorMessage();
                    }
                    methods.setSp(sp);
                    methods.setCol(col);
                    System.out.println("====");
                    methods.task3();
                    System.out.println("====");
                    animalView.printMenu();
                    break;
                }
            }
            if(inputNumber<0 || inputNumber>5){
                animalView.errorMessage();
            }
            inputNumber = scanner.nextInt();
        }
    }
}
