package Model;

import View.InputUtility;

public class Methods {
    private Animal[] animal;
    private ReadFile readFile = new ReadFile();
//    public Methods() {
//        Initialisation.initialization(animal);
//    }

    public Methods() {
        animal = readFile.readFile();
    }

    public Animal[] funcMorThanAge(int morThanAge) {
        Animal[] temp = new Animal[10];
        int index = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].getAge() > morThanAge) {
                System.arraycopy(animal, i, temp, index, 1);
                index++;
            }
        }
        Animal[] output = new Animal[index];
        System.arraycopy(temp, 0, output, 0, index);
        return output;
    }

    public Animal[] funcForEqualFamily(String fam) {
        Animal[] temp = new Animal[10];
        int index = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].getFamily().equals(fam)) {
                System.arraycopy(animal, i, temp, index, 1);
                index++;
            }
        }
        Animal[] output = new Animal[index];
        System.arraycopy(temp, 0, output, 0, index);
        return output;
    }

    public Animal[] funcForEqualSpeciesAndColor(String species, String color) {
        Animal[] temp = new Animal[10];
        int index = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].getSpecies().equals(species) && animal[i].getColor().equals(color)) {
                System.arraycopy(animal, i, temp, index, 1);
                index++;
            }
        }
        Animal[] output = new Animal[index];
        System.arraycopy(temp, 0, output, 0, index);
        return output;
    }

    public Animal[] getAnimal() {
        Animal[] temp = new Animal[10];
        System.arraycopy(animal, 0, temp, 0, 10);
        return temp;
    }

    public void question(Animal[] a){
        System.out.println("save file?");
        String s = InputUtility.familyForFunc();
        if (s.equals("y")){
            readFile.savaFile("tempFile.txt",a);
        }
    }
}
