package DataStructures.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CheckUnionIntersection {
    public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        // Write -- Your -- Code
        SinglyLinkedList<T>.Node currentNode = list1.getHeadNode();
        result.setHeadNode(list1.getHeadNode());
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = list2.getHeadNode();
        result.removeDuplicatesWithHashing();
        return result;
    }

    //performs intersection between list
    public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        // Write -- Your -- Code
        Map<T, Integer> map = new HashMap<>();
        SinglyLinkedList<T>.Node currentNode = list1.getHeadNode();
        while (currentNode != null) {
            map.put(currentNode.data, 1);
            currentNode = currentNode.nextNode;
        }
        currentNode = list2.getHeadNode();
        while (currentNode != null) {
            if (map.get(currentNode.data) != null) {
                result.insertAtEnd(currentNode.data);
            }
            currentNode = currentNode.nextNode;
        }
        result.removeDuplicatesWithHashing();
        return result;
    }
}
