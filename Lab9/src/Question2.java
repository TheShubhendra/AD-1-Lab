import java.util.Scanner;
class StackLl{
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next =  null;
		}
	}
	
	Node top;
	
	StackLl(){
		this.top = null;
	}

	public void push(int x) {
		Node node = new Node(x);
		if(this.top==null) {
			this.top = node;
		}else {
			node.next = this.top;
			this.top = node;
		}
	}

	public int pop() {
		if(top==null) {
			return  -1;
		}
		Node node = this.top;
		this.top = this.top.next;
		return node.data;
	}

	public void traverse() {
		Node curr = this.top;
		while(curr!=null) {
		System.out.print(curr.data + " ");
		curr = curr.next;
		}
		System.out.print("\n");
	}

	public int peek(){
		return top!=null? this.top.data : -1;
	}

	public boolean isEmpty() {
		return top == null;
	}
}

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackLl s = new StackLl();
		boolean exit = false;
		while(!exit) {
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: peek");
			System.out.println("4: traverse");
			System.out.println("5: Is empty?");
			System.out.println("0: Exit");
			System.out.print("Enter your choice: ");
			int x = sc.nextInt();
			switch(x) {
			case 1:
				System.out.print("Enter number to push: ");
				int y = sc.nextInt();
				s.push(y);
				break;
			case 2:
				System.out.println("Popped " + s.pop());
				break;
			case 3:
				System.out.println("Peeked " + s.peek());
				break;
			case 4:
				s.traverse();
				break;
			case 5:
				System.out.println("Is Empty? " + s.isEmpty());
				break;
			default:
				exit = true;
				break;
			}
			
		}
		System.out.print("Exited");
		sc.close();
	}

}
