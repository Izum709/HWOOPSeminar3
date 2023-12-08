import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VetClinic implements Iterable<Animal>{
    private String address;
    private  int number;
    private List<Personal> personals = new ArrayList<>();
    private List<Animal> patients = new ArrayList<>();
    private List<Personal> brigade = new ArrayList<>();
    int index;

    public VetClinic() {
    }

    public VetClinic(String address, int number,
                     List<Personal> personals, List<Animal> patients,
                     List<Personal> brigade) {
        this.address = address;
        this.number = number;
        this.personals = personals;
        this.patients = patients;
        this.brigade = brigade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Personal> getPersonals() {
        return personals;
    }

    public void setPersonals(List<Personal> personals) {
        this.personals = personals;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public void setPatients(List<Animal> patients) {
        this.patients = patients;
    }

    public List<Personal> getBrigade() {
        return brigade;
    }

    public void setBrigade(List<Personal> brigade) {
        this.brigade = brigade;
    }
    public VetClinic addPersonals(Personal personal){
        personals.add(personal);
        return this;
    }
    public void removePersonal(Personal personal){
        personals.remove(personal);
    }

    public VetClinic addPatient(Animal animal){
        patients.add(animal);
        return this;
    }

    public VetClinic addBrigade(Personal personal){
        brigade.add(personal);
        return this;
    }
    public List<Goable> getOlyGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if(animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
    public List<Flyable> getOnlyFlayable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal:patients){
            if(animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Speakable> getOnlySpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal animal:patients){
            if(animal instanceof Speakable){
                result.add((Speakable) animal);
            }
        }
        return result;
    }
    public List<Swimable> getOnlylSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:patients){
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "ВетКлиника МойПет " +
                "Адрес: " + address  +
                ", Лонтактный телефон: " + number +
                "\n\tСотрудники: " + personals +
                "\n\t Дежурная бригада: " + brigade +
                "\n\tПациенты: " + patients;
    }

    @Override
    public Iterator<Animal> iterator() {
        return new Iterator<Animal>() {
            @Override
            public boolean hasNext() {
                return index<patients.size();
            }

            @Override
            public Animal next() {
                return patients.get(index++);
            }
        };
    }
}
