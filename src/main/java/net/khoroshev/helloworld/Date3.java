package net.khoroshev.helloworld;

import java.util.Date;

/**
 * Created by Виктор on 30.06.2017.
 */

public class Date3{
    public static void main(String[] args) {
        print("Привет,сегодня");
        print(new Date());
    }

    public static void print(Object s) {
        System.out.println(s);
    }
}
