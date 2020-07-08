import java.util.HashSet;

class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        HashSet set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if(set.size() < i+1) {
                return A[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        RepeatedNTimes repeatedNTimes = new RepeatedNTimes();
        System.out.println(repeatedNTimes.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}