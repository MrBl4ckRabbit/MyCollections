package _02._10;

/*
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String
состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<>(map);
        Map<String, String> map2 = new HashMap<>(map);

        for (Map.Entry<String, String> entry1 : map1.entrySet()) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                if (entry1.getValue().equals(entry2.getValue())) {
                    removeItemFromMapByValue(map, entry1.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}

