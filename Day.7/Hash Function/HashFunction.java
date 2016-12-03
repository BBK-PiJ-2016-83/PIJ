import java.util.Scanner;
public class HashFunction implements HashUtilities{
	
	public static void main(String[]args){
		
		System.out.println ("Give me a string and I will calculate its hash code");
		
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		
		int hash = userInput.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		
		System.out.println("0 < " + smallHash + " < 1000");
	}

}