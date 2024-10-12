// Functional Interface
interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e){
        System.out.println("Executing code block....");
        e.execute();

    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // Pass as an Anonymous class - Before Java 8
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello there!!");
            }
        });

        System.out.println("================================");
        // Using Lambda Expression
        runner.run(() -> System.out.println("Hello there!! - Lambda"));

        // Lambda with multiple statements
        runner.run(() -> {
            System.out.println("One more statement with the help of Lambda");
            System.out.println("Hello there!! - Lambda");
        });
    }
}