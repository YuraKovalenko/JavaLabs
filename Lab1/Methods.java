package com.java.methods;

import com.java.model.Animal;
import com.java.initialisation.Initialisation;
import com.java.View.AnimalView;

public class Methods {
    Initialisation init = new Initialisation();
    AnimalView animalView = new AnimalView();
    Animal[] animal = new Animal[10];
    private int morThanAge;
    private String fam;
    private String sp,col;
    public int getMorThanAge(){
        return morThanAge;
    }
    public void setMorThanAge(int morThanAge){
        this.morThanAge=morThanAge;
    }
    public String getFam(){
        return fam;
    }
    public void setFam(String fam){
        this.fam=fam;
    }
    public String getSp(){
        return sp;
    }
    public void setSp(String sp){
        this.sp=sp;
    }
    public String getCol(){
        return col;
    }
    public void setCol(String col){
        this.col=col;
    }

    public void create(){
        init.initialization(animal);
    }
    public void task(){
        for (int i = 0; i<animal.length; i++){
            System.out.println(animal[i]);
        }
    }
    public void task1(){
        for (int i = 0; i<animal.length; i++){
            if(animal[i].getAge()>getMorThanAge()){
                System.out.println(animal[i]);
            }
        }
    }
    public void task2(){
        for (int i = 0; i < 10; i++) {
            if (animal[i].getFamily().equals(fam)) {
                System.out.println(animal[i]);
            }
        }
    }
    public void task3(){
        String[]str = new String[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (animal[i].getSpecies().equals(sp) && animal[i].getColor().equals(col)) {
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
            animalView.emptyMessage();
        }
    }
}
