package _01._08;

/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int tempMin = 0;
        int tempMax = 0;

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() > tempMax) {
                tempMax = i;
            }
            if (list.get(i).length() < tempMin) {
                tempMin = i;
            }
        }
        if (tempMin < tempMax) {
            System.out.println(list.get(tempMin));
        } else {
            System.out.println(list.get(tempMax));
        }


    }
}

