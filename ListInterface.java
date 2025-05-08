import java.util.*;
class collectionDemo
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
al.add("likky");
al.add("chitty");
al.add("lucky");
Iterator itr=al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
