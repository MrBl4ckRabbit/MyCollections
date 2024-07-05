package _01._03;

/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        int[] numbers = new int[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        System.out.println("**********************");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = strings[i].length();
            System.out.println(numbers[i]);
        }
    }
}

