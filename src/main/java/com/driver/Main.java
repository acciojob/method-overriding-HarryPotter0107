package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();

        // Calling the method from class A
        String resultFromA = objB.meth();
        System.out.println("Result from class A: " + resultFromA);

        // Calling the overridden method from class B
        String resultFromB = objB.meth();
        System.out.println("Result from class B: " + resultFromB);
    }
}

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}