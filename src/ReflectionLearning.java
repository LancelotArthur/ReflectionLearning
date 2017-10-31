import reflection.ReflectionTest;

import java.util.Scanner;

public class ReflectionLearning {
    public static void main(String[] args) {
        ReflectionTest reflectionTest = new ReflectionTest();
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter class name here: ");
        name = in.next();
        reflectionTest.printInfo(name);
    }
}
