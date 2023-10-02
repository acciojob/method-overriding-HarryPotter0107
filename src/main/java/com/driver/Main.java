package com.driver;

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

public class Main {
    public static void main(String[] args) {
        B objB = new B();

        // Calling the method from class A using objB
        String resultFromA = objB.meth();
        System.out.println(resultFromA);

        // Calling the overridden method from class B using objB
        String resultFromB = objB.meth();
        System.out.println( resultFromB);
    }
}