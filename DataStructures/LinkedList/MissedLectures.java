package DataStructures.LinkedList;

public class MissedLectures {

    public static void main(String[] args) {
        System.out.println(missedLectures(5, 5, 6));
        System.out.println(missedLectures(5, 13, 98));
        System.out.println(missedLectures(211137494, 24218280, 235355773));

    }

    public static long missedLectures(int numChapters, int b, int e) {
        long range = e - b + 1;
        return (range > numChapters) ? numChapters : range;
    }
}