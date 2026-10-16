package Collections_FrmWrk.stacknqueue;

public class StackMain {
	public static void main(String[] args) {
		MyStack stack= new MyStack();
		stack.push("alex");
		stack.push("raj");
		stack.push("blake");
		stack.push("maddy");
		System.out.println("size of the stack: "+stack.size);
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		System.out.println("size of the stack: "+stack.size);
	}

}
