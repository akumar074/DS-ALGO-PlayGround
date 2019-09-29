package DataStructures.LinkedList;

public class BinarySearchLinkedList {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    for (int i = 1; i <= 10; i++){
      linkedList.insertAtEnd(new ListNode(i));
    }
    int givenValue = 1;
    System.out.println("Q. Is " + givenValue + " in the Linked List " + linkedList.toString() + " ?");
    System.out.println("Answer: " + binarySearchWithIterator(linkedList.head, givenValue));
    System.out.println("Answer: " + binarySearch(linkedList.head, givenValue));
  }

  private static ListNode findMiddle(ListNode head){
    if(head == null)
      return null;
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

  private static boolean binarySearchWithIterator(ListNode head, int givenValue){
    ListNode start = head, last = null;
    do {
      ListNode middle = findMiddle(start, last);
      System.out.println(middle.getData());
      if(start.getData() == givenValue || middle.getData() == givenValue){
        return true;
      }
      if(start.next == last || middle == null){
        return false;
      }
      if(givenValue < middle.getData())
        last = middle;
      else if(givenValue > middle.getData())
        start = middle.getNext();
    } while ( last != null || last != start);
    return false;
  }

  private static ListNode findMiddle(ListNode start, ListNode last){
    if (start == null) {
      return null;
    }
    ListNode slow = start, fast = start;
    while(fast != last && fast.getNext() != last) {
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    return slow;
  }
}
