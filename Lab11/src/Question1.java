
public class Question1 {
	public static void main(String[] args) {
		Queue q = new Queue(100);
		q.enqueue(1);
		q.enqueue(5);
		System.out.println(q.dequeue());
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.dequeue());
		
		
	}
}


class Queue{
	int[] arr;
	int front = 0;
	int rear = -1;
	Queue(int capacity){
		this.arr = new int[capacity]; 
		
	}
	public void enqueue(int a) {
		if(isFull()) {
			System.out.println("Queue is Fulll");
			return;
		}
		arr[++rear] = a;
	}
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		return arr[front++];
		
	}
	public void display() {
		for(int i=front; i<=rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		
	}
	public boolean isEmpty() {
		return rear<front || front==-1;
	}	
	public boolean isFull() {
		return rear>=arr.length-1;
	}

}
