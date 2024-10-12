// Functional Interface
interface Executable {
    int execute(int a, int b); // abstract method
}

interface StringExecutable {
    int execute(String a); // abstract method
}

class Runner {
    public void run(Executable e){
        System.out.println("Executing code block....");
        int value = e.execute(5, 5);
        System.out.println("Return value is: " + value);
    }

//    public void run(StringExecutable e){
//        System.out.println("Executing code block....");
//        int value = e.execute("PI");
//        System.out.println("Return value is: " + value);
//    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // Pass as an Anonymous class - Before Java 8
        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello there!!");
                return b + a;
            }
        });

        System.out.println("================================");
        // Using Lambda Expression
//        runner.run(() -> System.out.println("Hello there!! - Lambda"));

        // Lambda with multiple statements
//        runner.run(() -> {
//            System.out.println("One more statement with the help of Lambda");
//            System.out.println("Hello there!! - Lambda");
//            return 8;
//        });

        // We don't need curly bracket if there is only single expression
        runner.run((a,b) -> b + a);

        System.out.println("Method Reference");
        runner.run(Integer::sum);
//        runner.run(a,b -> 10 + a); // without use of bracket this will not work with multiple parameters


    }
}