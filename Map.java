import java.util.*;
class CollectionDemo
{
public static void main(String args[])
{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"likky");
hm.put(2,"lucky");
hm.put(3,"chitty");
for(Map.Entry<Integer,String> entry:hm.entrySet())
{
System.out.println(entry.getKey()+" : "+entry.getValue());
}
}
}