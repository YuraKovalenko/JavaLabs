package com.java.Methods;

import com.java.Model.Animal;
import com.java.Initialisation.Initialisation;
import com.java.View.AnimalView;

public class Methods {
    Animal[] animal = new Animal[10];
    AnimalView animalView = new AnimalView();

    public void create(){
        Initialisation.initialization(animal);
    }

    public void printAllAnimals(){
        for(int i = 0; i < animal.length; i++){
            System.out.println(animal[i]);
        }
    }

    public void funcMorThanAge(int age){
        if(age>20){
            animalView.messageForFuncMorThanAge();
        }
        else {
            for(int i = 0; i < animal.length; i++){
                if(animal[i].getAge() > age){
                    System.out.println(animal[i]);
                }
            }
        }
    }

    public void equalFamily(String fam){
        if("cat".equals(fam) || "dog".equals(fam) || "cow".equals(fam)){
            for(int i = 0; i < animal.length; i++){
                if (animal[i].getFamily().equals(fam)){
                    System.out.println(animal[i]);
                }
            }
        }
        else {
            animalView.messageForFuncEqualsFamily();
        }
    }

    public void equalSpeciesAndColor(String species, String color){
        String[]str = new String[10];
        int count = 0;
        if ("sp1".equals(species) || "sp2".equals(species) || "sp3".equals(species) &&
        "blue".equals(color) || "red".equals(color) || "green".equals(color) || "yellow".equals(color)){
            for(int i = 0; i < animal.length; i++){
                if(animal[i].getSpecies().equals(species) && animal[i].getColor().equals(color)){
                    str[i]=animal[i].getSpecies();
                    System.out.println(animal[i]);
                }
            }
            for (int i = 0;i<10;i++){
                if (str[i]!=null){
                    count++;
                }
            }
            if (count==0){
                animalView.messageForFuncEqualSpeciesAndColor();
            }
        }
        else {
            animalView.messageForFuncEqualSpeciesAndColor();
        }
    }
}
