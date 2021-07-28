class A
{
int i;
A(int a, int b)
{
i = a+b;
}
void add()
{
System.out.println("Sum of a and b is: " + i);
}
}
class B extends A
{
int j;
B(int a, int b, int c)
{
super(a, b);
j = a+b+c;
}
void add()
{
super.add();
System.out.println("Sum of a, b and c is: " + j);
}
}
class MethodOverriding
{
public static void main(String args[])
{
B b = new B(10, 20, 30);
b.add();
}
}
