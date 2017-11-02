import reflection.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class ReflectionLearning {
    public static void main(String[] args) {
//        ReflectionTest reflectionTest = new ReflectionTest();
//        String name;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter class name here: ");
//        name = in.next();
//        reflectionTest.printInfo(name);
//        try {
//            MyClass myClass1 = new MyClass(1,"first");
//            MyClass myClass2 = new MyClass(2,"second");
//            Class c = MyClass.class;
//            Field field = c.getDeclaredField("name");
//            field.setAccessible(true);
//            Object name1 = field.get(myClass1);
//            Object name2 = field.get(myClass2);
//            field.set(myClass2,"third");
//            name2 = c.getName();
//            System.out.println(name1.toString());
//            System.out.println(name2.toString());
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        ArrayList<String> names = new ArrayList<>();
//        for(int i = 0 ; i != 13; i++)
//            names.add("student" + i);
        MyClass myClass = new MyClass(6,"Lancelot");
        System.out.println(new ObjectAnalyser().toString(myClass));
    }
}
