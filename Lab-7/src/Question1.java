class LinkedList{
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	LinkedList(int data) {
		this.head = new Node(data);
	}
	
	
	public void traverse() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.print("\n");
	
	}
	Node delete(int data) {
		if(head.data==data) {
			head = head.next;
			return head;
		}
		Node current = head;
		Node prev = null;

		while(current.next!=null && current.data !=data) {
			prev = current;
			current = current.next;
		}
		if(current.data == data) {
			prev.next = current.next;
			return current;
		}else {
			return null;
		}
	}
	
	Node insert(int data) {
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		Node node = new Node(data);
		curr.next = node;
		return node;
	}
	
	Node insert(int data, int pos) {
		Node node = new Node(data);
		if(pos==1) {
			node.next = head;
			head = node;
			return node;
		}
		Node curr = head;
		int i = 2;
		while(curr.next!=null && i<pos) {
			curr = curr.next;
			i++;
		}
		node.next = curr.next;
		curr.next = node;
		return node;
	}

	void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;	
		}
		head = prev;
	}
}
public class Question1 {
	public static void main(String[] args) {
		LinkedList a = new LinkedList(1);
		a.insert(2);
		a.insert(3);
		a.insert(4);
		a.insert(5);
		a.insert(6);
		a.insert(5,2);
		a.delete(1);
		a.traverse();
		a.reverse();
		a.traverse();
	}
}
