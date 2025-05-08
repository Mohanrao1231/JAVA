import java.util.*;
class collectionDemo
{
public static void main(String args[])
{
HashSet<String> h=new HashSet<String>();
h.add("likky");
h.add("chitty");
h.add("lucky");
Iterator itr=h.iterator();
System.out.println("in forward direction");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
