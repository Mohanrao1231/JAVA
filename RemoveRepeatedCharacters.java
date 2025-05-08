import java.util.Scanner;

public class RemoveRepeatedCharacters {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = s.nextLine(); // Corrected nextline() to nextLine()
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i)); // Fixed missing dot before append
            }
        }
        
        System.out.println("String after removing consecutive repeated characters: " + result.toString());
        
        s.close();
    }
}
