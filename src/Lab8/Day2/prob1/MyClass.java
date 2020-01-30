package Lab8.Day2.prob1;

import java.util.function.Predicate;

public class MyClass {

    private int x;
    private String y;
    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public void myMethod(MyClass c1) {
       Predicate<MyClass> predicate = this::equals;
       System.out.println("Are they equal: "+predicate.test(c1));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof MyClass))
            return false;

        MyClass myClass = (MyClass) o;
        return  this.y.compareTo(myClass.y) == 0 && this.x == myClass.x;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(1, "hello");
        MyClass myClass1 = new MyClass(2, "hello");
        myClass.myMethod(myClass1);
    }

}
