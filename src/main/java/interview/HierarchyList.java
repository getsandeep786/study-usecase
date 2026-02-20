package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HierarchyList {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(3, 5);
        hm.put(5, 8);
        hm.put(8, 17);
        hm.put(17, 23);
        hm.put(23, null);
        hm.put(4, 17);

        List<Integer> hierarchyList = generateHierarchyList(hm, 3);
        List<Integer> hierarchyList2 = new ArrayList<>();
        generateHierarchyListRecursive(hm, 3, hierarchyList2);
        System.out.println(hierarchyList2);
    }

    private static void generateHierarchyListRecursive(HashMap<Integer, Integer> hm, Integer current, List<Integer> list) {
        if (current == null || !hm.containsKey(current)) {
            list.add(current);
            return;
        }
        generateHierarchyListRecursive(hm, hm.get(current), list);
        list.add(current);
    }

    private static List<Integer> generateHierarchyList(HashMap<Integer, Integer> hm, int begin) {
        List<Integer> hierarchyList = new java.util.ArrayList<>();
        if(!hm.containsKey(begin)){
            return hierarchyList; // Return empty list if the key does not exist
        }
        Integer current = begin;
        while (current != null) {
            hierarchyList.add(current);
            current = hm.get(current);
        }
        Collections.reverse(hierarchyList);
        return hierarchyList;
    }
}
