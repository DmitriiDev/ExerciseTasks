import java.lang.reflect.Array;
import java.util.*;

public class CollectionsSort {


    public Set<String> foundSameWord(String[] arrayWords) {
        Set<String> collectSameWord = new LinkedHashSet<>();

        //какой вариант лучше? добавлять в коллекцию через add или addAll // общее правило: Если есть готовая функция "one-liner", то лучше использовать ее.
        collectSameWord.addAll(Arrays.asList(arrayWords));

       /* for (String str : arrayWords) {
            collectSameWord.add(str);
        }*/
        return collectSameWord;
    }

    public Map<String, Integer> countWords(String[] arrayWords) {
        Map<String, Integer> repeatWords = new HashMap<>();
        Set<String> collectWords = foundSameWord(arrayWords);
        int countRepeat = 0;
        for (String strFromSet : collectWords) {
            if (strFromSet != null) {
                for (String str : arrayWords) {
                    if (str != null) {
                        if (strFromSet.equals(str)) {
                            countRepeat++;
                        }
                    }
                }
                repeatWords.put(strFromSet, countRepeat);
                countRepeat = 0;
            }
        }
        return repeatWords;
    }

    public static void main(String[] args) {
        String[] twentyWordCollect = new String[20];
        twentyWordCollect[0] = "one";
        twentyWordCollect[1] = "two";
        twentyWordCollect[2] = "three";
        twentyWordCollect[3] = "tree";
        twentyWordCollect[4] = "one";
        twentyWordCollect[5] = "fd";
        twentyWordCollect[6] = "df";
        twentyWordCollect[7] = "6f";
        twentyWordCollect[8] = "7f";
        twentyWordCollect[9] = "fd";


        CollectionsSort cs = new CollectionsSort();
        Set<String> sameWords = cs.foundSameWord(twentyWordCollect);
        Map<String, Integer> countReapetWords = cs.countWords(twentyWordCollect);

        for (String str : sameWords) {
            if (str != null) System.out.print(str + " ");
        }

        for (Map.Entry<String, Integer> entry : countReapetWords.entrySet()) {
            System.out.print("\n" + entry.getKey() + " repeat: " + entry.getValue());
        }

    }
}

/*Моя реализация*/
/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово*/
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "c", "A", "B", "c", "A", "B", "c", "A", "B", "c"));
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arrayList) {
            if (!map.containsKey(s))
                map.put(s, 1);
            else
                map.put(s, map.get(s) + 1);
        }
        System.out.println(map);
    }
}


