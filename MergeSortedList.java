public class MergeSortedList {
  public static void main(String[] args) {
    Node head1 = new Node(2);
    Node head2 = new Node(1);
    head1.next = new Node(4);
    head2.next = new Node(3);
    head1.next.next = new Node(5);
    head1.next.next.next = new Node(9);
    head2.next.next = new Node(7);
    head2.next.next.next = new Node(10);
    head2.next.next.next.next = new Node(11);
    Node merged = merge(head1, head2);
    while (merged != null) {
      System.out.print(merged.data + " ");
      merged = merged.next;
    }
  }

  static Node merge(Node list1, Node list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    Node head;
    if (list1.data < list2.data) {
      head = list1;
    } else {
      head = list2;
      list2 = list1;
      list1 = head;
    }
    while(list1.next != null) {
      if (list1.next.data > list2.data) {
        Node tmp = list1.next;
        list1.next = list2;
        list2 = tmp;
      }
      list1 = list1.next;
    }
    list1.next = list2;
    return head;
  }
}

class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}
