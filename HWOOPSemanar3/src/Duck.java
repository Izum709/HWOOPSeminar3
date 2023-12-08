import java.time.LocalDate;

public class Duck extends Animal implements Goable, MaxSpeedable, Flyable, Speakable{


    public Duck(String ownerName, int numberOwner, String classAnimal, String nameAnimal, LocalDate birthdayAnimal, String illness, double weight) {
        super(ownerName, numberOwner, classAnimal, nameAnimal, birthdayAnimal, illness, weight);
    }

    @Override
    public void printGo() {
        System.out.println("Пошел на пруд");
    }

    @Override
    public double getMaxSpeed() {
        return 10.5;
    }

    @Override
    public void printFly() {
        System.out.println("Улетает на зимовку");
    }

    @Override
    public void getSpeak() {
        System.out.println("Krya-Krya");
    }
}
