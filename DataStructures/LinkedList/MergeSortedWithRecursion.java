package DataStructures.LinkedList;

public class MergeSortedWithRecursion {
	private ListNode mergeSorted(ListNode first, ListNode second) {
		ListNode head;
		if(first == null)
			return second;
		if(second == null)
			return first;
		if(first.getData() < second.getData()){
			head = first;
			first = mergeSorted(first.next, second);
		} else {
			head = second;
			second = mergeSorted(first, second.next);
		}
		return head;
	}
}
