package _01._07;

/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size()-1));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}


