package net.khoroshev.helloworld;
//operation/Date2 java
import java.util.Date;
/**
 * Created by Виктор on 27.06.2017.
 */
public class Date2 {
    public static void main(String[] args) {
        println("Today is: ");
        println(new Date());
    }

    private static void println(Object s) {
        System.out.println(s);
    }
}
