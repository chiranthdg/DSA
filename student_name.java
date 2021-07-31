import java.util.Scanner;

class Student{
	String name;
	int usn;
	int marks;
	Scanner sc=new Scanner(System.in);
	Student(){
		System.out.println("Constructor called");
	}
	void accept(){
		System.out.println("Enter name, usn, and marks in order:-");
		name=sc.next();
		usn=sc.nextInt();
		marks=sc.nextInt();
	}
	void display() {
		System.out.println(name+"\t"+usn+"\t"+marks);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:-");
		int n=sc.nextInt();
		Student []student=new Student[n];
		for(int i=0;i<n;i++) {
			student[i]=new Student();
			student[i].accept();
		}
		Student temp=new Student();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(student[j].marks>student[j+1].marks) {
					temp.name=student[j].name;
					temp.usn=student[j].usn;
					temp.marks=student[j].marks;
					student[j].name=student[j+1].name;
					student[j].usn=student[j+1].usn;
					student[j].marks=student[j+1].marks;
					student[j+1].name=temp.name;
					student[j+1].usn=temp.usn;
					student[j+1].marks=temp.marks;
				}
			}
		}
		for(int i=0;i<n;i++) {
			student[i].display();
		}

		sc.close();
	}

}
