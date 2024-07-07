package _02._13;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 3 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("MMM d yyyy", Locale.US);
        Date first = formater.parse(date);
        Date second = new Date();
        long distance = second.getTime() - first.getTime();
        int pri = 24 * 60 * 60 * 1000;
        int dateCount = (int) (distance / pri);

        if (dateCount % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}

