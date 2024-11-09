// not a functional interface - we can't use lamda expression
interface Employee {
    public void designation();
    public void salary();
}

// we don't need this class when we use anonymous inner class
class SoftwareEngineer implements Employee {

    @Override
    public void designation() {
        System.out.println("SDE");
    }

    @Override
    public void salary() {
        System.out.println("10K");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism can use with interface reference
        Employee employee = new SoftwareEngineer();
        employee.designation(); // SDE
        employee.salary(); // 10k

        // Anonymous class
        // we can see polymorphism example below by using interface reference
        Employee emp = new Employee() {
            @Override
            public void designation() {
                System.out.println("Animator");
            }

            @Override
            public void salary() {
                System.out.println("20K");
            }
        };
        emp.designation(); //Animator
        emp.salary();     // 20k

        Employee emp2 = new Employee() {
            @Override
            public void designation() {
                System.out.println("Tester");
            }

            @Override
            public void salary() {
                System.out.println("5k");
            }
        };
        emp2.designation();
        emp2.salary();
    }
}