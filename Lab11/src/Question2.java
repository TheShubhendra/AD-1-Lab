public class Question2 {
	public static void main(String[] args) {
		LLQueue q = new LLQueue();
		q.enqueue(1);
		q.enqueue(5);
		System.out.println("Dequed " + q.dequeue());
		q.enqueue(4);
		q.enqueue(5);
		System.out.println("Dequed " + q.dequeue());
		q.enqueue(54);
		q.display();
		
	}
	
	
}

class LLQueue{
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node front;
	Node rear;
	
	public void enqueue(int x) {
		if(isEmpty()) {
			rear = new Node(x);
			front = rear;
		}else {
			rear.next = new Node(x);
			rear = rear.next;
		}
	}
	
	
	public void display() {
		Node curr = front;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	
	public int dequeue() {
		int temp = front.data;
		front = front.next;
		return temp;
	}
	
	
	
	public boolean isEmpty() {
		return front==null;
	}

	
	
}
