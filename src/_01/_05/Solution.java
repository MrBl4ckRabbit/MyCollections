package _01._05;

/*
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


Requirements:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        list.add("Hi!");
        list.add("Hello!");
        list.add("Hola!");
        list.add("Dratuti!");
        list.add("Privet!");

        System.out.println("size: " + list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}

