package labday1;

import java.util.Scanner;
import java.util.StringTokenizer;

class Customer
{
	String nm,dob;
	protected static Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter name");
		nm=sc.next();
		System.out.println("Enter DOB dd/mm/yyyy");
		dob=sc.next();
	}
	public void display()
	{
		System.out.print("<"+nm+",");
		StringTokenizer s = new StringTokenizer(dob,"/");
		int cnt=0;
		while(s.hasMoreTokens())
		{
			System.out.print(s.nextToken());
			cnt++;
			if(cnt<3)
			{
				System.out.print(",");
			}
		}
		System.out.println(">");
	}
}
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.accept();
		c.display();

	}

}
