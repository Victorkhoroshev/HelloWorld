package net.khoroshev.helloworld;

import java.util.Date;

/** Первая программа-пример книги
 * выводит строку и текущее число
 * @ author Victor Khoroshev
 */
public class Date1 {
    /** точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws Date1 Исключени не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет,сегодня"); // комментарий в одну строку
        /*это комментарий
        *распростроняющийся
        * на несколько
        *строк
          */
        System.out.println(new java.util.Date());
    }
} /* Output. (55% match)
 Привет, сегодня.
 (День недели)(месяц)(число)(часы.минуты.секунды)(часовой пояс)(год)
 *///:~


