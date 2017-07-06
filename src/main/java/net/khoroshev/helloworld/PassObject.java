package net.khoroshev.helloworld;
//operators/PassObject java
/* Передача обьектов методам может работать
*не так,как привыкли*/
/**
 * Created by Виктор on 29.06.2017.
 */
class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c ='a';
        print("1: x.c:" + x.c);
        f(x);
        print("2: x.c:" + x.c);

    }

    private static void print(String s) {
        System.out.println(s);
    }
}

