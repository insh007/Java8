interface A {
    default void sayHello() {
        System.out.println("A says hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says hello");
    }
}


public class MyClass implements A,B {

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }

    @Override
    public void sayHello(){
        B.super.sayHello();
    }
}