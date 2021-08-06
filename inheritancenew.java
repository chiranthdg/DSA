package labday1;

import java.util.Scanner;

class Staff {
	private String sid,nm,ph;
	float sal;
	public static Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter Staff id ");
		sid=sc.next();
		System.out.println("Enter name ");
		nm=sc.next();
		System.out.println("Enter Phone number");
		ph=sc.next();
		System.out.println("Enter Salary");
		sal=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("Staff id "+sid);
		System.out.println("Name "+nm);
		System.out.println("Phone number "+ph);
		System.out.println("Salary "+sal);
	}
}
class Teaching extends Staff
{
	String dm;
	int pbs;
	public void accept()
	{
		System.out.println("Enter Teaching Staff details ");
		super.accept();
		System.out.println("Enter Domain ");
		dm=sc.next();
		System.out.println("Enter Publications");
		pbs=sc.nextInt();	
	}
	public void display()
	{
		super.display();
		System.out.println("Domain "+dm);
		System.out.println("Publications "+pbs);
	}
}
class Technical extends Staff
{
	String skills;
	public void accept()
	{
		System.out.println("Enter Technicl Staff details ");
		super.accept();
		System.out.println("Enter Skills ");
		skills=sc.next();
	}
	public void display()
	{
		super.display();
		System.out.println("Skills "+skills);
	}
}
class Contract extends Staff
{
	int period;
	public void accept()
	{
		System.out.println("Enter Contract Staff details ");
		super.accept();
		System.out.println("Enter Period ");
		period=sc.nextInt();
	}	
}
public class a
{
	public static void main(String [] args)
	{
		int n,i;
		System.out.println("Enter n value");
		n=Staff.sc.nextInt();
		Teaching t[]=new Teaching [n];
		for(i=0;i<t.length;i++)
		{
			t[i]=new Teaching();
		}
		Technical ti[]=new Technical[n];
		for(i=0;i<ti.length;i++)
		{
			ti[i]=new Technical();
		}
		Contract c[]=new Contract[n];
		for(i=0;i<c.length;i++)
		{
			c[i]=new Contract();
		}
		access(t,0);
		access(ti,0);
		access(c,0);
		System.out.println("Teaching");
		access(t,1);
		System.out.println("Technical");
		access(ti,1);
		System.out.println("Contract");
		access(c,1);
}
	public static void access(Staff t[],int val)
	{
		for(Staff s:t)
		{
			if(val==0)
					s.accept();
			else
				s.display();
		}
	}
} 
