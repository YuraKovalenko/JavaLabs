package Model;

public class Animal {
    private String type;
    private String kid;
    private String family;
    private String genus;
    private String species;
    private String subspecies;
    private int age;
    private String color;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
    public String toString() {
        return "Тип = " + type + " клас = " + kid + " сімейство = " + family + " рід = " + genus + " вид = " +
                species + " підвид = " + subspecies + " вік = " + age + " окрас = " + color;
    }
}
