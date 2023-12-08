import java.time.LocalDate;

public class Bird extends Animal implements MaxSpeedable, Flyable, Speakable{


    public Bird(String ownerName, int numberOwner, String classAnimal, String nameAnimal, LocalDate birthdayAnimal, String illness, double weight) {
        super(ownerName, numberOwner, classAnimal, nameAnimal, birthdayAnimal, illness, weight);
    }

    @Override
    public double getMaxSpeed() {
        return 35.4;
    }

    @Override
    public void printFly() {
        System.out.println("Летает только по дому");
    }

    @Override
    public void getSpeak() {
        System.out.println("Говорящий");
    }
}
