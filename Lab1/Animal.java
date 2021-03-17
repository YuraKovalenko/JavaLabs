package com.java.model;
public class Animal {
    private String type; //тип
    private String kid; //клас
    private String family; //сімейство
    private String genus; //рід
    private String species; //вид
    private String subspecies; //підвид
    private int age; //вік
    private String color; //окрас

    //тип
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    //клас
    public String getKid() {
        return kid;
    }
    public void setKid(String kid) {
        this.kid = kid;
    }
    //сімейство
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    //рід
    public String getGenus() {
        return genus;
    }
    public void setGenus(String genus) {
        this.genus = genus;
    }
    //вид
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    //підвид
    public String getSubspecies() {
        return subspecies;
    }
    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }
    //вік
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //окрас
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String type, String kid, String family, String genus, String species, String subspecies, int age, String color) {
        this.type = type;
        this.kid = kid;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.subspecies = subspecies;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Тип = " + type + " клас = " + kid + " сімейство = " + family + " рід = " + genus + " вид = " +
                species + " підвид = " + subspecies + " вік = " + age + " окрас = " +color;
    }
}
