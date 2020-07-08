import java.util.HashSet;

class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        HashSet uniqueMorseSet = new HashSet<String>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (char c: word.toCharArray()) {
                builder.append(morseCodes[c - 'a']);
            }
            uniqueMorseSet.add(builder.toString());
        }
        return uniqueMorseSet.size();
    }

    public static void main(String[] args) {
        UniqueMorseCode uniqueMorseCode = new UniqueMorseCode();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseCode.uniqueMorseRepresentations(words));
    }
}