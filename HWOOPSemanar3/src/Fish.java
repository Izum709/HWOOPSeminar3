import java.time.LocalDate;

public class Fish extends Animal implements MaxSpeedable, Swimable{


    public Fish(String ownerName, int numberOwner, String classAnimal, String nameAnimal, LocalDate birthdayAnimal, String illness, double weight) {
        super(ownerName, numberOwner, classAnimal, nameAnimal, birthdayAnimal, illness, weight);
    }

    @Override
    public double getMaxSpeed() {
        return 10.8;
    }

    @Override
    public void printSwim() {
        System.out.println("Плавает в аквариуме");
    }
}
