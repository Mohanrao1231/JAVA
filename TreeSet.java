import java.util.*;
class CollectionDemo
{
public static void main(String args[])
{
TreeSet<String> h=new TreeSet<String>();
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
