import java.util.Scanner;
class Stack{
	static int MAX_SIZE = 1000;
	int top;
	int arr[];
	
	Stack(){
		this.arr = new int[MAX_SIZE];
		this.top = -1;
	}

	public void push(int x) {
		this.arr[++top] = x;
	}

	public int pop() {
		return top>-1? this.arr[top--] : null;
	}

	public void traverse() {
		for(int i=top; i>=0; i--) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.print("\n");
	}

	public int peek(){
		return top>-1? this.arr[top--] : null;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}

public class Question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		boolean exit = false;
		while(!exit) {
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: peek");
			System.out.println("4: traverse");
			System.out.println("5: Is empty?");
			System.out.println("0: Exit");
			System.out.println("Enter your choice: ");
			int x = sc.nextInt();
			switch(x) {
			case 1:
				System.out.println("Enter number to push: ");
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
