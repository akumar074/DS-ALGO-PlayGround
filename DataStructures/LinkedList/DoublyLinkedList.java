package DataStructures.LinkedList;

public class DoublyLinkedList {
  // Properties
  private DLLNode head;
  private DLLNode tail;
  private int length;

  // Create a new empty list
  public DoublyLinkedList(){
    head = new DLLNode(Integer.MIN_VALUE, null, null);
    tail = new DLLNode(Integer.MIN_VALUE, head, null);
    head.setNext(tail);
    length = 0;
  }

  // Get the value at a position
  public int get(int position) {
    return Integer.MIN_VALUE;
  }

  // Find the first position of a value that equals to a given value
  public int findPosition(int data) {
    DLLNode temp = head;
    int pos = 0;
    while (temp != null){
      if(temp.getData() == data){
        return pos;
      }
      pos++;
      temp = temp.getNext();
    }
    return Integer.MIN_VALUE;
  }

  // Return the current length of the DLL
  public int length(){
    return length;
  }

  // Add a new value to the front of the list
  public void insertAtFront(int newValue){
      DLLNode newNode = new DLLNode(newValue, null, head.getNext());
      head.getNext().setPrevious(newNode);
      head = newNode;
      length += 1;
  }

  // Add a new value to the list at a given position
  public void insert(int data, int position){
    if(position < 0)
      position = 0;
    if(position > length)
      position = length;
    // If list is empty
    if(head == null){
      head = new DLLNode(data);
      tail = head;
    }
    // if adding front of the list
    else if(position == 0) {
      DLLNode temp = new DLLNode(data, null, head);
      head.setPrevious(temp);
      head = temp;
    }
    // else find correct position and insert
    else {
      DLLNode p = head;
      for(int pos = 0; pos < position; pos++) {
        p = p.getNext();
      }
      DLLNode newNode = new DLLNode(data, p, p.getNext());
      newNode.getNext().setPrevious(newNode);
      p.setNext(newNode);
    }
    length++;
  }

  // Add the value at the rear of the list
  public void insertAtEnd(int data) {
    DLLNode newNode = new DLLNode(data, tail, null);
    tail.setNext(newNode);
    tail = newNode;
    length++;
  }

  // Remove the value at a given position
  public void remove(int position) {
    if(position < 0)
      position = 0;
    if(position >= length)
      position = length - 1;
    if(head == null)
      return;
    if(position == 0) {
      head = head.getNext();
      if (head == null)
        tail = null;
    } else {
      DLLNode temp = head;
      for (int i = 0; i < position; i++){
        temp = temp.getNext();
      }
      temp.getNext().setPrevious(temp.getPrevious());
      temp.getPrevious().setNext(temp.getNext());
    }
    length--;
  }

  // Remove a node matching with a given node
  public void removeMatched(DLLNode node){
    if(head == null) return;
    if(node.equals(head)) {
      head = head.getNext();
      if(head == null) {
        tail = null;
        return;
      }
    }
    DLLNode p = head;
    while(p != null){
      if(node.equals(p)){
        p.getPrevious().setNext(p.getNext());
        p.getNext().setNext(p.getNext());
        return;
      }
    }
    length--;
  }

  // Remove and return the head value from the list
  public int removeHead(){
    if(length == 0)
      return Integer.MIN_VALUE;
    int data = head.getData();
    head = head.getNext();
    head.setPrevious(null);
    if(head == null)
      tail = null;
    length--;
    return data;
  }

  // Remove and return tail value from the list
  public int removeTail(){
    if(length == 0)
      return Integer.MIN_VALUE;
    int data = tail.getData();
    tail.getPrevious().setNext(null);
    tail = tail.getPrevious();
    length--;
    return data;
  }

  // Return a String representation of list
  public String toString(){
    String result = "[";
    if(length == 0)
      return result + "]";
    DLLNode node = head.getNext();
    result += head.getData();
    while (!node.equals(tail)){
      result += "," + node.getData();
      node = node.getNext();
    }
    return result + "," + tail.getData() + "]";
  }

  // Clear the list
  public void clear(){
    head = null;
    tail = null;
    length = 0;
  }
}
