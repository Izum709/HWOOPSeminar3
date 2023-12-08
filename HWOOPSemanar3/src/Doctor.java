import java.util.ArrayList;
import java.util.List;

public class Doctor extends  Personal{
    private List<Animal> patientsDoctor = new ArrayList<>();

    public Doctor(String name, String position, int phoneNumber, int salary) {
        super(name, position, phoneNumber, salary);
    }

    public void addPatientDoctor(Animal animal){
        patientsDoctor.add(animal);
    }
}
