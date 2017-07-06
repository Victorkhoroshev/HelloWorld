package net.khoroshev.helloworld;



/**
 * Created by Виктор on 25.06.2017.
 */
public class hello3 {
    public static void main(String[] args) {
        System.out.println("hello world");

        int x=1, y=2;
        int min = min(x, y);
        System.out.println(min);
        int max = max(x, y);
        System.out.println(max);
    }
    private static int min(int var1,int var2) {
        return var1 < var2 ? var1 : var2;
    }

    private static int max(int var1,int var2) {
        return var1 > var2 ? var1 : var2;
    }
}
