package reflection;

import java.util.*;
import java.lang.reflect.*;

/**
 * This program uses reflection to print all features of a class
 */
public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter class name here: ");
        name = in.next();

        try {
            //print class name and superclass name (if != Object)
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if(superc1 != null && superc1 != Object.class)
                System.out.print("extends " + superc1.getName());

            System.out.println(" {");
            System.out.println("Constructors:");
            printConstructors(c1);
            System.out.println("Methods:");
            printMethods(c1);
            System.out.println("Feilds:");
            printFeilds(c1);
            System.out.println("}");
        }
        catch(ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Prints all constructors of a class
     * @param c1
     */
    public static void printConstructors(Class c1) {
        Constructor[] constructors = c1.getDeclaredConstructors();
        for(Constructor c : constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifier = Modifier.toString(c.getModifiers());
            if(modifier.length() > 0) System.out.print(modifier + " ");
            System.out.print(name + "(");

            //print parameter types
            Class[] paraTypes = c.getParameterTypes();
            for(int j = 0; j !=paraTypes.length; j++) {
                if(j > 0) System.out.print(", ");
                System.out.print(paraTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param c1
     */
    public static void printMethods(Class c1) {
        Method[] methods = c1.getDeclaredMethods();
        for(Method method : methods) {
            Class retType = method.getReturnType();
            String name = method.getName();

            System.out.print("    ");
            //print modifiers, return type and method name
            String modifiers = Modifier.toString(method.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            //print parameters types
            Class[] paramTypes = method.getParameterTypes();
            for(int j = 0 ; j != paramTypes.length; j++) {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all filds of a class
     * @param c1
     */
    public static void printFeilds(Class c1) {
        Field[] fields = c1.getDeclaredFields();

        for(Field field : fields) {
            Class type = field.getType();
            String name = field.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(field.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }

}
