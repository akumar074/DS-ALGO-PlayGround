package DataStructures.LinkedList;

public class MergeSortedLinkedList{
  private ListNode mergeSorted(ListNode first, ListNode second){
    ListNode head = new ListNode(0);
    ListNode node = head;
    while(first != null && second != null){
      if(first.getData() < second.getData()){
        node.next = first;
        first = first.next;
      } else {
        node.next = second;
        second = second.next;
      }
    }
    if(first == null){
      node.next = second;
    }
    if(second == null) {
      node.next = first;
    }
    return head.next;
  }
}
