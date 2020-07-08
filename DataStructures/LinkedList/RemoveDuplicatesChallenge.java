package DataStructures.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesChallenge {

    public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        // Write -- Your -- Code
        Map<T, Integer> map = new HashMap<>();
        SinglyLinkedList<T>.Node prev = null;
        SinglyLinkedList<T>.Node currentNode = list.getHeadNode();
        while (currentNode != null) {
            if (map.get(currentNode.data) == null) {
                map.put(currentNode.data, 1);
                prev = currentNode;
            } else {
                prev.nextNode = currentNode.nextNode;
            }
            currentNode = currentNode.nextNode;
        }
    }
}
