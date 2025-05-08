class Student
{
int rollno;
String name;
Static Stringcollege;
Student(int r, String n)
{
rollno=r;
name=n;
}
Static void change()
{
college="lendi";
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
Student.change();
Student s1=new Student(1,"likky");
Student s2=new Student(2,"chitty");
Student s3=new Student(3,"lucky");
s1.display();
s2.display();
s3.display();
}
}