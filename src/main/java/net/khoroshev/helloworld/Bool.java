package net.khoroshev.helloworld;

import java.util.Random;

/**
 * Created by Виктор on 02.07.2017.
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i =" + i);
        print("j =" + j);
        print("i > j is " + (i > j));
        print("i < j is " + (i < j));
        print("i >= j is " + (i >= j));
        print("i <= j is " + (i <= j));
        print("i == j is " + (i == j));
        print("i != j is " + (i != j));
        // в Java целое число не может
        // интерпретироваться как логический тип boolean
        //! Print(" i && j is" + (i && j));
        //! Print(" i || j is" + (i || j));
        //! Print(" !i is" + !i);
        print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }

    public static void print(Object s) {
        System.out.println(s);

    }
}
