package jtcr9.stack;

public class StackController {

	public static void fixedController() {
		FixedStack mystack1 = new FixedStack(5);
		FixedStack mystack2 = new FixedStack(8);
		
		// push some numbers onto the stack
		for(int i=0; i<5; i++) mystack1.push(i);
		for(int i=0; i<8; i++) mystack2.push(i);
		
		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i=0; i<8; i++)
			System.out.println(mystack2.pop());
	}
	
	public static void dynamicController() {
		DynamicStack mystack1 = new DynamicStack(5);
		DynamicStack mystack2 = new DynamicStack(8);
		
		// these loops cause each stack to grow
		for(int i=0; i<12; i++) mystack1.push(i);
		for(int i=0; i<20; i++) mystack2.push(i);
		
		System.out.println("Stack in mystack1:");
		for(int i=0; i<12; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i=0; i<20; i++)
			System.out.println(mystack2.pop());
	}
	
	public static void stackController() {
		Stack mystack; // create an interface reference variable
		DynamicStack ds = new DynamicStack(5);
		FixedStack fs = new FixedStack(8);
		
		mystack = ds; // load dynamic stack
		// push some numbers onto the stack
		for(int i=0; i<12; i++) mystack.push(i);
		
		mystack = fs; // load fixed stack
		for(int i=0; i<8; i++) mystack.push(i);
		
		mystack = ds;
		System.out.println("Values in dynamic stack:");
		for(int i=0; i<12; i++)
			System.out.println(mystack.pop());
		
		mystack = fs;
		System.out.println("Values in fixed stack:");
		for(int i=0; i<8; i++)
			System.out.println(mystack.pop());
	}
}
