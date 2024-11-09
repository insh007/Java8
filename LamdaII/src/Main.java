// Functional Interface
interface Employee {
    public void designation();
}

// With Lamda expression we don't need to create this class
class SoftwareEngineer implements Employee {

    @Override
    public void designation() {
        System.out.println("SDE");
    }
}

public class Main {
    public static void main(String[] args) {

        // Polymorphism || Flexibility
       Employee employee = new SoftwareEngineer();
       employee.designation(); // SDE

        // No Polymorphism || Tight Coupling
       SoftwareEngineer softwareEngineer = new SoftwareEngineer();
       softwareEngineer.designation(); // SDE

        // With Lamda Expression || Polymorphism
        Employee emp = () -> System.out.println("Using Lamda - SDE");
        emp.designation();

        Employee emp2 = () -> System.out.println("Using Lamda - QA");
        emp2.designation();
    }
}