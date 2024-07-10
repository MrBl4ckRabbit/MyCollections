package _02._5;

/*
Нужно создать два списка - LinkedList и ArrayList.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна содержать только три метода.
4. Метод createArrayList() должен создавать и возвращать список ArrayList.
5. Метод createLinkedList() должен создавать и возвращать список LinkedList.*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static Object createArrayList() {
        return new ArrayList<>();
    }

    public static Object createLinkedList() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();
    }
}

