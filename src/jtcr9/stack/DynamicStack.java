package jtcr9.stack;

public class DynamicStack implements Stack {

	private int stack[];
	private int tos;
	
	public DynamicStack(int size) {
		this.stack = new int[size];
		this.tos = -1;
	}

	@Override
	public void push(int item) {
		if (tos == stack.length - 1) {
			int temp[] = new int[stack.length * 2];
			for (int i = 0; i < stack.length; i++) temp[i] = stack[i];
			stack = temp;
		}
		stack[++tos] = item;
	}

	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stack[tos--];
	}

}
