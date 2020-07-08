package DataStructures.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CheckFirstUnique {

    public static int findFirstunique(int[] arr) {
//        Map<Integer, Boolean> map = new LinkedHashMap<>();
//        for (int value : arr) {
//            if (map.containsKey(value))
//                map.put(value, true);
//            else
//                map.put(value, false);
//        }
//        for (Map.Entry entry: map.entrySet()) {
//            if (!(boolean) entry.getValue())
//                return (int) entry.getKey();
//        }
//        return 0;
        Map<Integer, Integer> countElements = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            countElements.put(arr[i], 0);
        }
        for (int i = 0; i < arr.length; i++) {
            countElements.put(arr[i], countElements.get(arr[i]) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (countElements.get(arr[i]) <= 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("First Unique element: " + findFirstunique(new int[]{4, 4, 4, 3}));
    }
}
