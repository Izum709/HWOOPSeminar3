import java.time.LocalDate;

public class Dog extends Animal implements Goable, MaxSpeedable, Speakable {


    public Dog(String ownerName, int numberOwner, String classAnimal, String nameAnimal, LocalDate birthdayAnimal, String illness, double weight) {
        super(ownerName, numberOwner, classAnimal, nameAnimal, birthdayAnimal, illness, weight);
    }

    @Override
    public void printGo() {
        System.out.println("На прогулке");
    }

    @Override
    public double getMaxSpeed() {
        return 20.7;
    }

    @Override
    public void getSpeak() {
        System.out.println("Wow");
    }
}
