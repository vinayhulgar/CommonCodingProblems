
/**
 *
 * Three nodes have been allocated dynamically
 * 
 * llist.head		second			   third
 *     |			  |			         |
 * +---+-----+	  +---+---+--+      +---+---+--+
 * | 1 |null|	  | 2 | null |     | 3 | null |
 * +---+-----+	  +---+---+--+      +---+---+--+
 * 
 *
 */
public class LinkedList {
	// head of the list
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){  // Constructor
			data = d;
			next = null;
		}
	}
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		// Link first node with second node
		llist.head.next=second;
		// link second node to third node
		second.next = third;
		llist.printList();
	}
}
