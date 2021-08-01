import java.util.LinkedList;
class Student
{
    String name;
    int usn;
    Student(String name,int usn)
    {
        this.name=name;
        this.usn=usn;
    }
    public String toString()
    {
        return " Name: "+ name + " USN: " + usn;
    }
}
public class Main
{
	public static void main(String[] args) {
		
		LinkedList<Student> std = new LinkedList<Student>();
        std.add(new Student("Hello",5));
        std.addFirst(new Student("Bye",10));
        std.addLast(new Student("okay",15));
        std.add(1, new Student("zinger",20));
        for (Student element :std)
            System.out.println(element + "");
        std.remove();  
        System.out.println("after\n");
        for (int i = std.size()-1; i >=0; i--) { 
            System.out.print(std.get(i) + "\n"); 
        } 
	}
}
