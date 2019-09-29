package com.demo.learning.easy;

class JewelsInStones {
    public int numJewelsInStones(String J, String S) {
        char[] jS = S.toCharArray();
        int count = 0;
        for(int i = 0; i < jS.length; i++) {
            if(J.indexOf(jS[i]) >= 0) { count++; }
        }
        return count;
    }
}