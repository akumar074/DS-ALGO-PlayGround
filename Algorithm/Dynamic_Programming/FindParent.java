package Algorithm.Dynamic_Programming;

import java.util.LinkedList;
import java.util.Queue;

public class FindParent {
    public static void main(String[] args) {
        System.out.println(findParent(7));
    }

    public static int findParent(int processNumber) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int s = 1, c = s+1;
        queue.add(c);
        if(processNumber == c) {
            return s;
        }
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int i = c+1; i <= c+current; i++) {
                if(i == processNumber) {
                    return current;
                } 
                queue.add(i);
            }
            c += current;
        }
        return -1;
    }
}
