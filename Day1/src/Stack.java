
public class Stack {
	
	int MAX = 1000;
	int a[] = new int[MAX];
	int top;
	Stack(){
		top = -1;
	}
	
	boolean push(int x){
		if(top >= (MAX -1)) {
			System.out.print("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println("pushed element:"+x);
			return true;
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(90);
		System.out.println(s.pop()+" element poped successfully");
	}

}
