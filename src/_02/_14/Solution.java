package _02._14;

/*
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String month=sc.nextLine();

        Calendar calendar = Calendar.getInstance();
        Map<String, Integer> map = calendar.getDisplayNames(Calendar.MONTH,Calendar.LONG, Locale.ENGLISH);
        System.out.println(month+ " is  the " + (map.get(month)+1) + " month");
    }
}

