package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class ProgrammerString {
    
    public static void main(String[] args) {
        System.out.println(programmerString("programmerxxxprozmerqgram"));
    }

    public static int programmerString(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        final String PROGRAMMER_STRING = "programmer";
        for (int i = 0; i < PROGRAMMER_STRING.length();i++) {
            if(map.containsKey( PROGRAMMER_STRING.charAt(i))) {
                map.put(PROGRAMMER_STRING.charAt(i),map.get( PROGRAMMER_STRING.charAt(i))+1);
            } else {
                map.put( PROGRAMMER_STRING.charAt(i), 1);
            }
        }
        Map<Character, Integer> temp = new HashMap<Character, Integer>(map);
        int count = 0, leftIndex = 0, rightIndex = 0;
        // leftmost string matching
        for(int i = 0; i < s.length();i++) {
            if(temp.get(s.charAt(i))!= null && temp.get(s.charAt(i)) > 0) {
                temp.put(s.charAt(i),temp.get(s.charAt(i))-1);
                count++;
            }
            if(count == PROGRAMMER_STRING.length()){
                leftIndex = i;
                break;
            }
        }
        temp = new HashMap<Character, Integer>(map);
        count = 0;
        // rightmost string matching 
        for(int i = s.length()-1; i > leftIndex;i--) {
            if(temp.get(s.charAt(i))!= null && temp.get(s.charAt(i)) > 0) {
                temp.put(s.charAt(i),temp.get(s.charAt(i))-1);
                count++;
            }
            if(count == PROGRAMMER_STRING.length()){
                rightIndex = i;
                break;
            }
        }
        return rightIndex - leftIndex - 1;
    }
}
