/**
 * Created by Damian on 30.10.2017.
 */
public class Employee {

    private String name;
    private String lastname;
    private Double monthSalary;
    private int age;

    public Employee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Employee(String name, String lastname, Double monthSalary) {
        this.name = name;
        this.lastname = lastname;
        this.monthSalary = monthSalary;
    }

    public Employee(String name, String lastname, Double monthSalary, int age) {
        this.name = name;
        this.lastname = lastname;
        this.monthSalary = monthSalary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Double getMonthSalary() {
        return monthSalary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (checkNameAndLastnameIsCorrect(name)) {
            this.name = name;
        }
    }

    public void setLastname(String lastname) {
        if (checkNameAndLastnameIsCorrect(lastname)) {
            this.lastname = lastname;
            }
        }

    private boolean checkNameAndLastnameIsCorrect(String name){
        if (name.length() == 5 && Character.isUpperCase(name.charAt(0))){
            return true;
        }else {
            System.out.println("Podano niepoprawne dane");
            return false;
        }
    }

    public void setMonthSalary(Double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getYearSalary(){
        return getMonthSalary() * 12;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", monthSalary=" + monthSalary +
                ", age=" + age +
                '}';
    }
}
