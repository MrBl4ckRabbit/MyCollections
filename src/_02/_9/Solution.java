package _02._9;

/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String
 состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Smith", "Tom");
        stringMap.put("Williams", "Ben");
        stringMap.put("Johnson", "Alice");
        stringMap.put("Brown", "Karl");
        stringMap.put("Jones", "David");
        stringMap.put("Davies ", "Ben");
        stringMap.put("Johns", "Lilly");
        stringMap.put("Taylor", "Tom");
        stringMap.put("Wilson", "Karl");
        stringMap.put("Gray", "Sasha");
        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (name.equals(entry.getValue())) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (lastName.equals(entry.getKey())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Ben"));
        System.out.println(getCountTheSameLastName(createMap(), "Wilson"));
    }
}

