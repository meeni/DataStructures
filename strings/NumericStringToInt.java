package strings;
import java.util.Scanner;

public class NumericStringToInt {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter any string :");
			Scanner sc = new Scanner(System.in);
			String stringInput=sc.nextLine();
			
			int newString = Integer.parseInt(stringInput);
			
			System.out.println(newString);
		}


}
