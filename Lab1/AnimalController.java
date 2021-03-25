package com.java.Controller;

import com.java.Methods.Methods;
import com.java.View.AnimalView;

import java.util.Scanner;

public class AnimalController {

    public void Start(){
        AnimalView animalView = new AnimalView();
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        int inputNumber;
        animalView.printMenu();
        inputNumber = scanner.nextInt();
        while (inputNumber!=5){
            if(inputNumber<1 || inputNumber>5){
                animalView.errorMessage();
                animalView.message();
            }
            methods.create();
            switch (inputNumber){
                case 1:{
                    methods.printAllAnimals();
                    break;
                }
                case 2:{
                    animalView.messageForCase2();
                    int morThanAge = scanner.nextInt();
                    methods.funcMorThanAge(morThanAge);
                    break;
                }
                case 3:{
                    animalView.messageForCase3();
                    String fam;
                    fam = scanner.next();
                    methods.equalFamily(fam);
                    break;
                }
                case 4:{
                    animalView.messageForCase4();
                    String sp,col;
                    sp = scanner.next();
                    col = scanner.next();
                    methods.equalSpeciesAndColor(sp,col);
                    break;
                }
            }
            animalView.printMenu();
            inputNumber = scanner.nextInt();
        }
    }
}

