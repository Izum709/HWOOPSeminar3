import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Animal barsik = new Cat("Saha",123456,"Cat","Barsik",
                LocalDate.of(2020,5,12),"Diarrhea",5.7);
        Dog bobik = new Dog("Dima",1234321,"Dog", "Bobik",
                LocalDate.of(2019,12,1),"Chukka",27.2);
        Animal dorry = new Fish("Olga", 456723, "Fish",
                "Dorry",LocalDate.of(2023,1,1),"Stress",0.1);
        Duck krya = new Duck("Nina", 345123, "Duck",
                "Kryakva", LocalDate.of(2019,5,20),"Firearms",3.5);
        Animal kesha = new Bird("Sara",3482648, "Parrot",
                "Kesha", LocalDate.of(2016,9,3),"Worms",0.3);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(bobik);
        animals.add(kesha);
        animals.add(dorry);
        animals.add(krya);


        VetClinic vetClinic = new VetClinic();
        vetClinic.setAddress("Набережная");
        vetClinic.setNumber(1234556789);
        Personal vitya = new Doctor("Виктор","Доктор",123321, 110000);
        Personal inna = new Doctor("Инна","Доктор",3451235, 100000);
        Personal vasya = new Nurse("Василий","Медбрат",573846,70000);
        Personal katya = new Nurse("Екатерина","Медсестра",573866,60000);

        List<Personal> personals = new ArrayList<>();
        personals.add(vasya);
        personals.add(inna);
        personals.add(vitya);
        personals.add(katya);


        vetClinic.addPersonals(vasya).addPersonals(vitya).addPersonals(inna).addPersonals(katya);
        vetClinic.addPatient(kesha).addPatient(dorry).addPatient(bobik).addPatient(krya).addPatient(barsik);
        vetClinic.addBrigade(vitya).addBrigade(katya);


        PharmacyComponent water = new Woter("Water","10mg",15);
        Azitromit azitromit = new Azitromit("Azitromit","5mg", 10);
        Levomocin levomocin = new Levomocin("Levomicin","12mg",30);
        Penicillin penicillin = new Penicillin("Penicillin", "20mg",18);



        Pharmacy pharmacy1 = new Pharmacy(Arrays.asList(water, azitromit,levomocin,penicillin), 1);
        Pharmacy pharmacy2 = new Pharmacy(Arrays.asList(water, azitromit,levomocin,penicillin), 2);
        Pharmacy pharmacy3 = new Pharmacy(Arrays.asList(penicillin,azitromit), 3);
        Pharmacy pharmacy4 = new Pharmacy(Arrays.asList(penicillin,water),4);

        Set<Pharmacy> result = new HashSet<>(Arrays.asList(pharmacy1, pharmacy2, pharmacy3,pharmacy4));
        System.out.println(result.size()); // Выводит количество уникальных экземпляров Pharmacy


        List<Pharmacy> sort = new ArrayList<>();
        sort.add(pharmacy1);
        sort.add(pharmacy3);
        sort.add(pharmacy4);
        sort.add(pharmacy2);
        sort.add(pharmacy1);

        Collections.sort(sort);
        System.out.println("//////////////////////////");
        System.out.println(sort); // сортировка по индексу
    }

}
