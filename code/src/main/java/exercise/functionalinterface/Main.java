package exercise.functionalinterface;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface func = text -> System.out.println(text);
        func.doSomething("do something");

        FunctionalInterface func2 = new FunctionalInterface() {
            @Override
            public void doSomething(String text) {
                System.out.println(text);
            }
        };
        func2.doSomething("do something2");
    }
}
