package _02._6;

/*
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только 5 методов.
4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList(10_000);
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
         insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i <= 10_000; i++) {
            list.add(i);
            System.out.println(i + ": Add the new element");
        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.println(i + ": Get the element");
        }

    }

    public static void set10000(List list) {
        for (int i = 0; i < list.size(); i++) {//итерация с конца потому что если с начала ,то удалит только 5кэлементов.потому что удаляются индексы
            list.set(i, "someObject");
            System.out.println(i + ": Set the element");
        }

    }

    public static void remove10000(List list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
            System.out.println(i + ": Remove the element");
        }

    }
}


