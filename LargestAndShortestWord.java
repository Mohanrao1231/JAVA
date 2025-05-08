import java.util.Scanner;
import java.lang.String;
public class LargestAndShortestWord
{
public static void main(String args[])
{
Scanner s = new scanner(System.in);
System.out.println("enter a sentence:");
String sentence=s.nextLine();
String[] words=sentence.split("\\s+");
String largestWord=words[0];
String shortestWord=words[0];
for(int i=0;i<words.length;i++)
{
String word = words[i];
if(word.length()>largestWord.length())
{
largestWord = word;
}
if(word.length() < shortestWord.length())
{
shortestWord=word;
}
}
System.out.println("Largest word:"+largestWord);
System.out.println("Shortest word:"+shortestWord);
}
}