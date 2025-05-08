import java.util.*;
public class CollectionDemo
{
public static void main(String[] args)
{
PriorityQueue<String> p=new PriorityQueue<String>();
p.add("likky");
p.add("lucky");
p.add("chitty");
p.add("pandu");
p.add("pandu");
System.out.println("head: "+p.element());
System.out.println("head: "+p.peek());
Iterator itr=p.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
p.remove();
p.poll();
System.out.println("iterating the elements after removed");
Iterator itr1=p.Iterator();
while(itr1.hasNext())
{
System.out.println(itr1.next());
}
}
}
