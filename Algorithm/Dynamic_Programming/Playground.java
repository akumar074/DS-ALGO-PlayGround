package Algorithm.Dynamic_Programming;

public class Playground {

    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        System.out.println(new Playground().countAndSay(2));
    }

    public String countAndSay(int n) {
        return encode("1", n, 1);
    }

    public String encode(String num, int times, int curr){
        String str = "";
        if(times == curr) {
            return num;
        }
        int i = 0, count = 0;
        char ch = num.charAt(0);
        while (i < num.length()){
            char a = num.charAt(i);
            if (a == ch) {
                count++;
            } else {
                str += count + ch;
                ch = a;
                count = 1;
            }
            i++;
        }
        str += count + ch;
        return encode(str, times, curr);
}}
