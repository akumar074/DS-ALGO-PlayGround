package DataStructures.LinkedList;

public class BinarySearchLinkedList {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    for (int i = 1; i <= 10; i++){
      linkedList.insertAtEnd(new ListNode(i));
    }
    int givenValue = 5;
    System.out.println("Q. Is " + givenValue + " in the Linked List " + linkedList.toString() + " ?");
    System.out.println("Answer: " + binarySearch(linkedList.head, givenValue));
  }

  private static ListNode findMiddle(ListNode head){
    ListNode slow = head, fast = head;
    while(fast != null && fast.getNext() != null) {
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    return slow;
  }

  private static boolean binarySearch(ListNode head, int givenValue){
    ListNode middle = findMiddle(head);
    if(head.getData() == givenValue || givenValue == middle.getData()){
      return true;
    }
    if(middle == null || middle.getNext() == null){
      return false;
    }
    if (givenValue < middle.getData()){
      middle.setNext(null);
      return binarySearch(head, givenValue);
    } else {
      return binarySearch(middle, givenValue);
    }
  }
}
