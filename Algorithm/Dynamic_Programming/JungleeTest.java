package Algorithm.Dynamic_Programming;

import java.util.HashSet;

public class JungleeTest {
    public static void main(String[] args) {
        System.out.println(vowelsubstring("aeioaexaaeuiou"));
    }

    public static int vowelsubstring(String s) {
        // Write your code here
        HashSet<Character> set = new HashSet<>();
        
        int pos = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                set.add(s.charAt(i));
                if(set.size() == 5)
                System.out.print(s.substring(pos, i + 1) + " ");
            } else {
                pos = i+1;
                set.clear();
            }
        }
        return count;
        }
        
        public static boolean isVowel(char ch) {
            return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        }
}
