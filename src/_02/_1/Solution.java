package _02._1;

/*
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.


Requirements:
1. Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("арбуз");
        strings.add("банан");
        strings.add("вишня");
        strings.add("груша");
        strings.add("дыня");
        strings.add("ежевика");
        strings.add("женьшень");
        strings.add("земляника");
        strings.add("ирис");
        strings.add("картофель");

        for (String string : strings) {
            System.out.println(string);
        }

    }
}

