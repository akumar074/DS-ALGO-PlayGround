package Algorithm.Dynamic_Programming;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(2));
    }

    public static String countAndSay(int number) {
        String result = "1";
        for (int i = 1; i < number; i++) {
            result = say(result);
        }
        return result;
    }

    public static String say(String a) {
        StringBuilder sb = new StringBuilder();
        char ch = a.charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ch) {
                count++;
            } else {
                sb.append(count).append(ch);
                ch = a.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }


}
