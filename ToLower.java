



class ToLower {
    public String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        String lowered = "";
        for (int i = 0; i < charArray.length; i++) {
            if((int)charArray[i] > 64 && (int)charArray[i] < 91) {
                lowered += (char)((int)charArray[i] + 32);
            } else { lowered += charArray[i]; }
        }
        return lowered;
    }

    public static void main(String[] args) {
        ToLower lower = new ToLower();
        System.out.println(lower.toLowerCase("Str"));
    }
}