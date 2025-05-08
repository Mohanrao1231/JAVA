import java.util.*;
public class Main
{
public static void main(String args[])
{
Stack<String> stack=new Stack<String>();
Stack.push("likky");
Stack.push("chitty");
Stack.push("lucky");
Stack.push("pandu");
Stack.push("holika");
Stack.pop();
Iterator<String> itr=Stack.iterator();
while(itr.hasNext());
{
System.out.println(itr.next());
}
}
}
