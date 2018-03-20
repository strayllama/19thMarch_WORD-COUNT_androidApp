package lab.codeclan.wordcounter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 19/03/2018.
 */

public class Counter {
    private HashMap<String, Integer> wordListCounted;

    public Counter() {
        wordListCounted = new HashMap<>();

    }

    public String countWords(String stringOfWords) {
        String[] words = stringOfWords.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            // This replaces all no a-z_A-Z_0-9 with nothing, i.e. removes punctuation.
            words[i] = words[i].replaceAll("[^\\w]", "").toLowerCase();
            if (wordListCounted.containsKey(words[i]) == true ) {
//                int oldcount = wordListCounted.get(words[i]);
//                int newcount = oldcount + 1;
//                wordListCounted.put(words[i], newcount);
                wordListCounted.put(words[i], wordListCounted.get(words[i]) + 1);
            } else {
                wordListCounted.put(words[i], 1);
            }
        }

//        HashMap<String, Integer> map = wordListCounted;
// method Comparable would be better.
        // COPIED AND PASTED FROM https://stackoverflow.com/questions/21054415/how-to-sort-a-hashmap-by-the-integer-value
//        Object[] array = map.entrySet().toArray();   // makes an array of hash objects with each key-value pair
//        Arrays.sort(array, new Comparator() {
//            public int compare(Object ob1, Object ob2) {
//                return ((Map.Entry<String, Integer>) ob2).getValue()
//                        .compareTo(((Map.Entry<String, Integer>) ob1).getValue());
//            }
//        });
//        for (Object e : array) {
//            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
//                    + ((Map.Entry<String, Integer>) e).getValue());
//        }


        return wordListCounted.toString();
    }

}
