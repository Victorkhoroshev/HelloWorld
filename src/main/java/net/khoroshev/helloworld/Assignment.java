package net.khoroshev.helloworld;

/**
 * Created by Виктор on 30.06.2017.
 */
class Tank{
    int level;
}
public class Assignment{
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1 level = " + t1.level + " ;t2 level = " + t2.level);
        t1 = t2;
        print("2: t1 level = " + t1.level + " ;t2 level = " + t2.level);
        t1.level = 20;
        print("3: t1 level = " + t1.level + " ;t2 level = " + t2.level);
    }

    public static void print(Object s) {
        System.out.println(s);
    }
}