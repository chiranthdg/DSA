package labday1;

import java.util.Scanner;

class stack {

	private int top,a[],sz;
	private static Scanner sc;
	stack()
	{
		top=-1;
		System.out.println("Enter size");
		sz=sc.nextInt();
		a=new int[sz];
	}
	public static void initialize_scanner()
	{
		sc=new Scanner(System.in);
	}
	public static Scanner use_scanner()
	{
		return sc;
	}
	public void push()
	{
		int info;
		if(this.top==this.sz-1) {
			System.out.println("Stack is Full");
			return;
		}
		System.out.println("Enter info");
		info=sc.nextInt();
		top++;
		a[top]=info;
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Element deleted is "+a[top]);
		top--;
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("contents of stack are");
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack.initialize_scanner();
		int ch;
		stack st=new stack();
		for(;;)
		{
			System.out.println("1.Push\n2.Pop\n3.Dispaly\n4.exit");
			System.out.println("Enter choice");
			ch=(stack.use_scanner()).nextInt();
			switch(ch)
			{
			case 1:st.push();break;
			case 2:st.pop();break;
			case 3:st.display();break;
			case 4:return;
			}
		}
	}

}
