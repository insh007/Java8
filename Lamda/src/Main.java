// Functional Interface
interface Executable {
    int execute(); // abstract method
}

class Runner {
    public void run(Executable e){
        System.out.println("Executing code block....");
        int value = e.execute();
        System.out.println("Return value is: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // Pass as an Anonymous class - Before Java 8
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello there!!");
                return 7;
            }
        });

        System.out.println("================================");
        // Using Lambda Expression
//        runner.run(() -> System.out.println("Hello there!! - Lambda"));

        // Lambda with multiple statements
        runner.run(() -> {
            System.out.println("One more statement with the help of Lambda");
            System.out.println("Hello there!! - Lambda");
            return 8;
        });

        // We don't need curly bracket if there is only single expression
        runner.run(() -> 10);
    }
}