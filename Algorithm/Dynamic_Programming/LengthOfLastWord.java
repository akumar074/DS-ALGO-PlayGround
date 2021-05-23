package Algorithm.Dynamic_Programming;

public class LengthOfLastWord {
    public static void main(String[] args) {
        
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}
