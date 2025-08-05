import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;
        
        int charCount = 0, vowelCount = 0, consonantCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                charCount++;
                if (Character.isLetter(ch)) {
                    char lower = Character.toLowerCase(ch);
                    if ("aeiou".indexOf(lower) != -1) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
        }
        
        System.out.println("\n--- Analysis ---");
        System.out.println("Words: " + wordCount);
        System.out.println("Characters (excluding spaces): " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
