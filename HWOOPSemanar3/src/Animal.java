import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Animal implements Comparable<Animal> {
    private String ownerName;
    private int numberOwner;
    private String classAnimal;
    private String nameAnimal;
    private LocalDate birthdayAnimal;
    private String illness;
    private  double weight;

    public Animal(String ownerName, int numberOwner, String classAnimal, String nameAnimal,
                  LocalDate birthdayAnimal, String illness, double weight) {
        this.ownerName = ownerName;
        this.numberOwner = numberOwner;
        this.classAnimal = classAnimal;
        this.nameAnimal = nameAnimal;
        this.birthdayAnimal = birthdayAnimal;
        this.illness = illness;
        this.weight = weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getNumberOwner() {
        return numberOwner;
    }

    public void setNumberOwner(int numberOwner) {
        this.numberOwner = numberOwner;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public void setClassAnimal(String classAnimal) {
        this.classAnimal = classAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public LocalDate getBirthdayAnimal() {
        return birthdayAnimal;
    }

    public void setBirthdayAnimal(LocalDate birthdayAnimal) {
        this.birthdayAnimal = birthdayAnimal;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n\tПациент " +
                "\nИмя хозяина: " + ownerName +
                "\nКонтактный телефон: " + numberOwner +
                "\nСемейство: " + classAnimal + '\'' +
                "\nИмя питомца: " + nameAnimal + '\'' +
                "\nДата рождения: " + birthdayAnimal +
                "\nЗаболевание: " + illness +
                "\n Вес: " + weight;
    }

    @Override
    public int compareTo(Animal o) {
        if(this.weight>o.weight){
            return 1;
        } else if (this.weight<o.weight) {
            return -1;
        }
        return 0;
    }


//    public int compareTo(Animal o) {
//        if(this.birthdayAnimal.getDayOfYear()>o.birthdayAnimal.getDayOfYear()){
//            return 1;
//        } else if (this.birthdayAnimal.getDayOfYear()<o.birthdayAnimal.getDayOfYear()) {
//            return -1;
//        }
//        return 0;
//    }

}
