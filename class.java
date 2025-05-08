import java.util.*;
public class Main
{
public static void main(String args[])
{
priorityQueue<String> al=new PriorityQueue<String>();
al.add("likky");
al.add("lucky");
al.add("chitty");
al.add("holi");
Iterator itr=al.Iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
