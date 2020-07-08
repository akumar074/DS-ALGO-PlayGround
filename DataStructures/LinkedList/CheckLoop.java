package DataStructures.LinkedList;

public class CheckLoop {
    //Detects loop in the given linked list
    public static <T> boolean detectLoop(SinglyLinkedList<T> list) {
        //Write -- Your -- Code
        SinglyLinkedList<T>.Node slow = list.getHeadNode();
        SinglyLinkedList<T>.Node fast = list.getHeadNode();
        while (slow != null && fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
            if (slow == fast) return true;
        }
        return false;
    }
}
