public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node r = reverseList(head);
        while(r != null) {
            System.out.println(r.data + " ");
            r = r.next;
        }
    }

    static Node reverseList(Node head) {
        Node curr = head.next;
        head.next = null;
        return reverse(curr, head);
    }

    static Node reverse(Node curr, Node prev) {
        Node head;
        if (curr.next == null) {
            curr.next = prev;
            head = curr;
            return head;
        }

        Node temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        head = reverse(curr, prev);
        return head;
    }
}
