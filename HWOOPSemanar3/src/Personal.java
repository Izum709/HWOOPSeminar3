public class Personal  implements Comparable<Personal>{
    public int index;
    private String name;
    private String position;
    private  int phoneNumber;
    private int salary;

    public Personal(String name, String position, int phoneNumber, int salary) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\n\tСотрудник: " +
                "\nИмя: " + name  +
                "\nДолжность: " + position  +
                "\nКонтактный телефон: " + phoneNumber +
                "\nЗарплата: " + salary;
    }

    @Override
    public int compareTo(Personal o) {
        if(this.salary>o.salary){
            return 1;
        }
        else if (this.salary<o.salary){
            return -1;
        }
        return 0;
    }
}
