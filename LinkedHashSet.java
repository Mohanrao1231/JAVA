import java.util.*;
class collectionDemo
{
public static void main(String args[])
{
LinkedHashSet<String> h=new LinkedHashSet<String>();
h.add("likky");
h.add("chitty");
h.add("lucky");
Iterator<String> itr=h.iterator();
System.out.println("in forward direction");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
