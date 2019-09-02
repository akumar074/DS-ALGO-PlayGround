package DataStructures.LinkedList;

import java.util.List;

public class LinkedList {
  // Head of the list
  ListNode head;
  // Length of the Linked List
  private int length = 0;

  // Default constructor
  public LinkedList() {
    length = 0;
  }

  // Returns teh first of the list
  public synchronized ListNode getHead () {
    return head;
  }

  // Insert a node at the beginning of the list
  public synchronized void insertAtBegin(ListNode node) {
    node.setNext(head);
    head = node;
    length++;
  }

  // Insert a node at the end of the list
  public synchronized void insertAtEnd(ListNode node) {
    if (head == null) {
      head = node;
    } else {
      ListNode p,q;
      for(p = head; (q = p.getNext()) != null; p = q);
      p.setNext(node);
    }
    length++;
  }

  // Add a new value at a given position
  public void insert(int data, int position) {
    //fix the position
    if(position < 0) {
      position = 0;
    }
    if(position > length) {
      position = length;
    }
    // if list is empty make it first element
    if(head == null) {
      head = new ListNode(data);
    }
    // if adding at the front of list
    else if (position == 0){
      ListNode temp = new ListNode(data);
      temp.setNext(head);
      head = temp;
    }
    // else find the correct position and insert
    else {
      ListNode temp = head;
      for (int i = 0; i < position; i++) {
        temp = temp.getNext();
      }
      ListNode newNode = new ListNode(data);
      newNode.setNext(temp.getNext());
      temp.setNext(newNode);
    }
    length++;
  }

  // Remove and return newNode at the head of the list
  public synchronized ListNode removeFromBegin() {
    ListNode node = head;
    if(node != null) {
      head = node.getNext();
      node.setNext(null);
    }
    return node;
  }

  // Remove and return the node at the end of the list
  public synchronized ListNode removeFromEnd() {
    if(head == null) {
      return null;
    }
    length--;
    ListNode p = head, q = null, next = head.getNext();
    if(next == null) {
      head = null;
      return p;
    }
    while (p.getNext() != null){
      q = p;
      p = p.getNext();
    }
    q.setNext(null);
    return p;
  }

  // Remove a Node matching the specified node from the list
  public synchronized void removeMatched(ListNode node) {
    if(head == null) {
      return;
    }
    length--;
    if (node.equals(head)) {
      head = head.getNext();
      return;
    }
    ListNode p = head, q = null;
    while ((q = p.getNext()) != null){
      if(q.equals(node)){
        p.setNext(q.getNext());
        return;
      }
      p = q;
    }
  }

  // Remove the value at a given position
  public void remove(int position){
    if(position == 0)
      position = 0;
    if(position >= length){
      position = length - 1;
    }
    // if list is empty
    if(head == null)
      return;
    // if removing the head element
    if(position == 0){
      head = head.getNext();
    }
    // find position and remove
    else {
      ListNode temp = head;
      for(int i = 0; i < position; i++) {
        temp = temp.getNext();
      }
      temp.setNext(temp.getNext().getNext());
    }
    length--;
  }

  // Return a string representation of the collection
  public String toString(){
    String result = "[";
    if(head == null) {
      return result + "]";
    }
    result = result + head.getData();
    ListNode temp = head.getNext();
    while (temp != null) {
      result = result + "," + temp.getData();
      temp = temp.getNext();
    }
    return result + "]";
  }

  // Return the current length of the list
  public int length(){
    return length;
  }

  // Find the position of the first value that is equal to the given value
  public int getPosition(int data){
    ListNode temp = head;
    int pos = 0;
    while (temp != null) {
      if(data == temp.getData()){
        return pos;
      }
      pos++;
      temp = temp.getNext();
    }
    // else some large value
    return Integer.MAX_VALUE;
  }

  // Remove everything from the list
  public void clearList(){
    head = null;
    length = 0;
  }
}
