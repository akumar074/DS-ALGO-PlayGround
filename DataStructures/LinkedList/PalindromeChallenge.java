package DataStructures.LinkedList;

public class PalindromeChallenge {

    public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
        // Write Your Code Here
        DoublyLinkedList<T>.Node fromHead = list.getHeadNode();
        DoublyLinkedList<T>.Node fromTail = list.getTailNode();

        while (fromHead != fromTail) {
            if (!fromHead.data.equals(fromTail.data))
                return false;
            fromHead = fromHead.nextNode;
            fromTail = fromTail.prevNode;
        }
        return true;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        System.out.println(isPalindrome(list));
    }
}