import java.util.*;
class collectionDemo
{
public static void main(String args[])
{
LinkedList<Integer> ll=new LinkedList<Integer>();
ll.add(24);
ll.add(45);
ll.add(78);
ListIterator itr=ll.listIterator();
System.out.println("in forward direction");
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("in backward direction");
while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
}
}
