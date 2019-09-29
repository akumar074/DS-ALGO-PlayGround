public class ReverseLinkedListInGroup {
    public static void main(String[] args) {
        Node head = reverse(createList(), 3);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node reverse(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null)
            head.next = reverse(next, k);
        return prev;
    }

    static Node createList () {
        Node head = new Node(1);
        Node curr = head;
        for (int i = 2; i < 11; i++) {
            curr.next = new Node(i);
            curr = curr.next;
        }
        return head;
    }
}
