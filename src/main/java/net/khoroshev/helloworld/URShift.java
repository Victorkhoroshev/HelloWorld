package net.khoroshev.helloworld;
//Проверка беззнакового сдвига вправо
/**
 * Created by Виктор on 04.07.2017.
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        print(Integer.toBinaryString(i));
        i >>>= 10;
        print(Integer.toBinaryString(i));
        long I = -1;
        print(Long.toBinaryString(I));
        I >>>= 10;
        print(Long.toBinaryString(I));
        short s = -1;
        print(Integer.toBinaryString(s));
        s >>>= 10;
        print(Integer.toBinaryString(s));
        byte b = -1;
        print(Integer.toBinaryString(b));
        b >>>= 10;
        print(Integer.toBinaryString(b));
        b = -1;
        print(Integer.toBinaryString(b));
        print(Integer.toBinaryString(b >>> 10));
    }

    public static void print(Object s) {
        System.out.println(s);

    }
}
