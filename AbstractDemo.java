abstract class A
{
abstract void m1();
void m1()
{
System.ut.println("this is concrete methode");
}
}
class B extends A
{
void m1()
{
System.out.println("B class implements m1");
}
}
class AbstractDemo
{
public static void main(String args[])
{
B obj=new B();
obj.m1();
obj.m2();
}
}








