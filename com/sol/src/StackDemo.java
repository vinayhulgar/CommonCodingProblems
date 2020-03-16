public class Stack {
	int top;
	int MAX=1000;
	int[]a = new int[MAX];
	Stack(){
		top = -1;
	}
	boolean isEmpty(){
		return (top<0);
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Popped From Stack"+s.pop());
	}
	private boolean push(int x) {
		if(top>=MAX){
			System.out.println("Stack OverFlow");
			return false;
		}
		else{
			a[++top] = x;
			return true;
		}
	}
	private int pop() {
		if(top<0){
			System.out.println("Stack UnderFlow");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
	}
}
