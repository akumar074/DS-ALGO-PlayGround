package DataStructures.LinkedList;

public class CheckMid {

    public static <T> Object findMiddle(SinglyLinkedList<T> list) {
        // Write -- Your -- Code
        SinglyLinkedList<T>.Node slow = list.getHeadNode();
        SinglyLinkedList<T>.Node fast = list.getHeadNode();
        while (fast.nextNode != null && fast.nextNode.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        return slow.data;
    }
}
