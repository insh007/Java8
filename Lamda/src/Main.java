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

    }
}