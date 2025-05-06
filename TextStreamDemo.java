import java.io.*;
import java.util.Scanner;

public class TextStreamDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter text to save to file: ");
	String input=scanner.nextLine();
	BufferedWriter writer = null;
	try {
		writer= new BufferedWriter(new FileWriter("output txt"));
		writer.write(input);
		System.out.println("Text has been written to output txt");
	} catch (IOException e) {
		System.out.println("An error occurred" + e.getMessage());
	} finally {
		try {
			if (writer!= null) {
			writer.close();
		}
	} catch (IOException e) {
		System.out.println("Error closing writer" + e.getMessage());
	}
        }
    }
}
