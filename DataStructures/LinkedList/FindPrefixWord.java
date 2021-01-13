package DataStructures.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrefixWord {
    public static void main(String[] args) {
        List<Integer> result = findCompletePrefixes(Arrays.asList("steve", "stevens", "danny", "steves", "dan", "john", "johnny", "joe", "alex", "alexander"),
        Arrays.asList("steve", "alex", "joe", "john", "dan"));
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findCompletePrefixes(List<String> names, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++){    
            int count = 0;
            for (String name : names) {
                if (name.startsWith(queries.get(i)) && name.length() > queries.get(i).length()) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
