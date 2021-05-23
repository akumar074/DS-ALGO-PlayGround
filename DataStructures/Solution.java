package DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

    private int totalRemoved = 0;

    public int solution(String S) {
        HashMap<Character, Integer> occurenceMap = new HashMap<>();
        HashSet<Integer> occurences = new HashSet<>();


        for (int i = 0; i < S.length(); i++) {
            if (occurenceMap.get(S.charAt(i)) != null) {
                occurenceMap.put(S.charAt(i), occurenceMap.get(S.charAt(i)) + 1);
            } else {
                occurenceMap.put(S.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : occurenceMap.entrySet()) {
            canAdd(entry.getValue(), occurences);
        }
        return totalRemoved;
    }

    public void canAdd(int value, HashSet<Integer> occurences) {
        if(value > 0){
            if(occurences.contains(value)) {
                canAdd(value - 1, occurences);
                totalRemoved++;
            } else {
                occurences.add(value);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("example"));
        System.out.println(new Solution().solution("ccaaffddecee"));
        System.out.println(new Solution().solution("eeee"));
        System.out.println(new Solution().solution("aaaabbbb"));
    }
}
