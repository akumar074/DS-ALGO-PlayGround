package DataStructures.LinkedList;

public class NthElementChallenge {

    public static <T> Object nthElementFromEnd(SinglyLinkedList<T> list, int n) {
        // Write -- Your -- Code
        if (n == 0 || n > list.getSize())
            return null;
        SinglyLinkedList<T>.Node currentNode = list.getHeadNode();
        int count = 1;
        while (currentNode != null) {
            if (count == (list.getSize() - n + 1))
                return currentNode.data;
            count++;
            currentNode = currentNode.nextNode;
        }
        return null;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        System.out.println("" + nthElementFromEnd(list, 2));
    }
    
}