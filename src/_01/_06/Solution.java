package _01._06;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    private static ArrayList<String> strings;

    public static ArrayList<String> createList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        return list;
    }

    public static ArrayList<String> longestString(ArrayList<String> someList) {
        int temp = 0;
        for (String s : someList) {
            if (s.length() > temp) {
                temp = s.length();
            }
        }
        ListIterator<String> iterator = someList.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() < temp) {
                iterator.remove();
            }
        }
        return someList;
    }


    public static void main(String[] args) throws Exception {
        ArrayList<String> list = createList();
        System.out.println(longestString(list));
    }
}


