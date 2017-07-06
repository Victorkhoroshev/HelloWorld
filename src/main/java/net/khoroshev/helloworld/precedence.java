package net.khoroshev.helloworld;

/**
 * Created by Виктор on 29.06.2017.
 */
public class precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;        //(1)
        int b = x + (y - 2)/(2 + z);    //(2)
        int a = y + (z * z)/(y + x);    //(3)
        System.out.println("a=" + a + "b=" + b);
    }
} /* Output
a=5 b=1
*///:~
