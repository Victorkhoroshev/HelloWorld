package net.khoroshev.helloworld;

import static net.khoroshev.helloworld.Util.print;

/**
 * Created by Виктор on 06.07.2017.
 */
public class Ternant {
    public static void main(String[] args) {
        int i = 1;
        int k = 2;
        print(module(-1));
    }

    private static int module(int i) {
        return i<0 ? -i : i;
    }

}
