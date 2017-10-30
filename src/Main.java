/**
 * Created by Damian on 30.10.2017.
 */
public class Main {

    public static void main(String[] args){

        Employee employee = new Employee("Jan", "Kowalski", 2340.50, 34);
        employee.setName("adam");
        System.out.println("Roczna pensja pracownika wynosi"+employee.getYearSalary());
    }
}
