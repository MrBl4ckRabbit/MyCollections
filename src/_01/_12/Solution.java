package _01._12;

/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите количество строк,которые нужно добавить в конец: ");
        int m = sc.nextInt();
        sc.nextLine();

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        for (int i = 0; i < m; i++) {
            String temp = strings.get(0);
            strings.remove(0);
            strings.add(temp);
        }
        System.out.println("***********************");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

