package net.khoroshev.helloworld;

/**
 * Created by Виктор on 01.07.2017.
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i =" + i);
        print("++i =" + ++i);//предфиксный инкремент
        print("i++ =" + i++);//постфиксный инкремент
        print("i =" + i);
        print("--i =" + --i);//предфиксный декремент
        print("i-- =" + i--);//постфиксный декремент
        print("i =" + i);
    }

    public static void print(Object s) {
        System.out.println(s);

    }
}
