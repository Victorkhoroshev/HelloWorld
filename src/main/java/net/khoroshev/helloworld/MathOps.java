package net.khoroshev.helloworld;
//operation/MathOps java
import java.util.Random;

/**
 * Created by Виктор on 30.06.2017.
 */
public class MathOps {
    public static void main(String[] args) {
        //создание и раскрутка генератора случайных чисел.
        Random rand = new Random(1);
        int i, j, k;
        // выбор значения от 1 до 100:
        j = rand.nextInt(100) + 1;
        print("j :" + j);
        k = rand.nextInt(100) + 1;
        print("k :" + k);
        i = j + k;
        print("j + k =" + i);
        i = j - k;
        print("j - k =" + i);
        i = k / j;
        print("k / j =" + i);
        i = k * j;
        print("k * j =" + i);
        i = k % j;
        print("k % j =" + i);
        j %= k;
        print("j %/ k =" + j);
        //Тесты для вещественных чисел
        float u, v, w; //также можно использовать double
        v = rand.nextFloat();
        print("v =" + v);
        w = rand.nextFloat();
        print("w =" + w);
        u = v + w;
        print("v + w =" + u);
        u = v - w;
        print("v - w =" + u);
        u = v * w;
        print("v * w =" + u);
        u = v / w;
        print("v / w =" + u);
        //следующее относится к типам:
        //char,byte,short,int,long и double :
        u += v;
        print("u += v =" + u);
        u -= v;
        print("u -= v =" + u);
        u *= v;
        print("u *= v =" + u);
        u /= v;
        print("u /= v =" + u);


    }

    public static void print(Object s) {
        System.out.println(s);

    }
}
