package net.khoroshev.helloworld;

/**
 * Created by Виктор on 02.07.2017.
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; //шестнадцатиричне (нижний регистр)
        print("i1 = " + Integer.toBinaryString(i1));
        int i2 = 0X2F; //шестнадцатиричне (верхний регистр)
        print("i2 = " + Integer.toBinaryString(i2));
        int i3 = 0177; //Восьмеричное (начинается с нуля)
        print("i3 = " + Integer.toBinaryString(i3));
        char c = 0xffff; //макс. шестнадцатеричное значение. char
        print("c = " + Integer.toBinaryString(c));
        int a = new Integer(0);
        a = i1 + i2;
        print("a = " + Integer.toBinaryString(a));
    }
    public static void print(Object s) {
        System.out.println(s);

    }

}
