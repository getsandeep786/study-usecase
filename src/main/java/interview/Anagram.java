package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static void main(String args[]) {
        System.out.println(calculateAnagram("listen", "silent"));
        String[] anagramArray = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent"};
        List<List<String>> anagram = getAnagramGroup(anagramArray);
        System.out.println(anagram);

    }

    private static List<List<String>> getAnagramGroup(String[] anagramArray) {
        List<List<String>> anagramGroup = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String word : anagramArray) {
            char[] wordTemp = word.toCharArray();
            Arrays.sort(wordTemp);
            String sortedWord = String.valueOf(wordTemp);
            List<String> currentAnagramList = new ArrayList<>();
            if (hm.containsKey(sortedWord)) {
                currentAnagramList = (ArrayList<String>) hm.get(sortedWord);

            }
            currentAnagramList.add(word);
            hm.put(sortedWord, currentAnagramList);

        }
        System.out.println(hm);
        anagramGroup.addAll(hm.values());
        return anagramGroup;
    }

    private static boolean calculateAnagram(String word1, String word2) {
        if (word1 == null || word2 == null || (word1.length() != word2.length()))
            return false;
        char[] wordArray = word1.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
            if (word1.contains(String.valueOf(wordArray[i])) && word2.contains(String.valueOf(wordArray[i]))) {
                word1 = word1.replaceFirst(String.valueOf(wordArray[i]), "");
                word2 = word2.replaceFirst(String.valueOf(wordArray[i]), "");
            } else {
                return false;
            }
        }
        if (word1.isEmpty() && word2.isEmpty())
            return true;
        return false;
    }

}
