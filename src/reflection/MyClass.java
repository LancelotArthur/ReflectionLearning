package reflection;

public class MyClass {
    private int myInt;

    private String name;

    public MyClass() {
        myInt = 0;
        name = "";
    }

    public MyClass(int i, String name) {
        this.myInt = i;
        this.name = name;
    }

    public void setI(int i) {
        this.myInt = i;
    }

    public int getI() {
        return myInt;
    }
}
