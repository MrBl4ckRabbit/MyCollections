package _01._11;

/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента,
нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки,
то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(sc.nextLine());
        }

        int temp = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > temp + i || strings.get(i).length() < temp + i) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}

