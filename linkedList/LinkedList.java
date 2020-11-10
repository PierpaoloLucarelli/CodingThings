public class LinkedList {
	Node head;

	public LinkedList(int data){
		this.head = new Node(data);
	}

	public void printList(){
		this.head.printList();
	}

	public void add(int data){
		this.head.add(data);
	}


	public static void main(String args[]){
		LinkedList ll = new LinkedList(1);
		ll.add(2);
		ll.add(3);
		ll.printList();
	}
}

class Node{
	public Node next;
	public int data;
	
	public Node(int data){
		this.data = data;
	}

	public void printList(){


		System.out.println("Printing");
		Node n = this;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void add(int data){
		System.out.println("adding element " + data);
		Node end = new Node(data);
		Node n = this;
		while(n.next != null){
			System.out.println("one loop");
			n = n.next;
		}
		n.next = end;
	}
}