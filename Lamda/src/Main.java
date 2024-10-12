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

//       final int c = 100; // JDK 7
        int c = 100; // JDK 8 - Effectively final - no need to use final in JDK 8
//        c = 50; // Can't change because of Effectively final when you want to use this variable in anonymous class or lambda expression

        int d = 40; // In outer scope

        Runner runner = new Runner();
        // Pass as an Anonymous class - Before Java 8
//        runner.run(new Executable() {
//            @Override
//            public int execute(int a, int b) {
//                System.out.println("Hello there!!");
//                int d = 50; //can do this in method of anonymous classes because of other scope in anonymous class
//                return c + d + b + a; // 160 - 100+50+5+5
//            }
//        });

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
//        runner.run((a,b) -> {
////            int d = 50; // can't do this because of already defined variable; no new scope
//           return c + d + b + a; // 150 - 100+40+5+5
//        });

        System.out.println("some different use");
        Executable ex = (a,b) -> {
           return c + d + b + a; // 150 - 100+40+5+5
        };

        runner.run(ex);

        Object codeBlock = (Executable)(a,b) -> {
            return c + d + b + a; // 150 - 100+40+5+5
        };

    }
}