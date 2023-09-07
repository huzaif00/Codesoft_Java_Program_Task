import java.util.Scanner;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 'text' to enter text or 'file' to provide a file: ");
        String ch = sc.nextLine();

        String input = "";

        if (ch.equalsIgnoreCase("text")) {
            System.out.print("Enter your text: ");
            input = sc.nextLine();
        } else if (ch.equalsIgnoreCase("file")) {
            System.out.print("Enter the path to the file: ");
            String filePath = sc.nextLine();
            input = readFile(filePath);
        } else {
            System.out.println("Wrong choice . Please enter 'text' or 'file'.");
            sc.close();
            return;
        }

      
        String[] words = input.split("[\\s\\p{Punct}]+");

      
        int word = words.length;

    
        System.out.println("Total word count: " + word);

        sc.close();
    }

  
    private static String readFile(String filePath) {
        StringBuilder cont = new StringBuilder();
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = read.readLine()) != null) {
                cont.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return cont.toString();
    }
}
