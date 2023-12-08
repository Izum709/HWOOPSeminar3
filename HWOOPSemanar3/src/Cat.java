import java.time.LocalDate;

public class Cat extends Animal implements Goable, MaxSpeedable, Speakable {


    public Cat(String ownerName, int numberOwner, String classAnimal, String nameAnimal, LocalDate birthdayAnimal, String illness, double weight) {
        super(ownerName, numberOwner, classAnimal, nameAnimal, birthdayAnimal, illness, weight);
    }

    @Override
    public void printGo() {
        System.out.println("Ушел на мышиную охоту");
    }

    @Override
    public double getMaxSpeed() {
        return 21.5;
    }

    @Override
    public void getSpeak() {
        System.out.println("Mow");
    }
}
