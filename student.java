import java.util.Scanner;
class Student
{
int Id;
String Name;
String gender;
String department;
int age;
public void insertStudent()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter student id:");
      Id=sc.nextInt();
System.out.println("enter student Name:");
      Name=sc.next();
System.out.println("enter student gender:");
      gender=sc.next();
System.out.println("enter student department:");
      department=sc.next();
System.out.println("enter student age");
      age=sc.nextInt();
}
public void displayStudent()
{
System.out.println(Id);
System.out.println(Name);
System.out.println(gender);
System.out.println(department);
System.out.println(age);
}
public static void main(String args[])
{
Student s1=new Student();
 s1.insertStudent();
 s1.displayStudent();
  }
}


