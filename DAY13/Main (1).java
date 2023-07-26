/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary number"); 
		String first = sc.nextLine(); 
		System.out.println("Enter second binary number"); 
		String second = sc.nextLine(); 
		String sum = add(first, second);
		System.out.println("Sum of two binary number is : " + sum);
	}
	public static String add(String first, String second) { 
		int b1 = Integer.parseInt(first, 2); 
		int b2 = Integer.parseInt(second, 2); 
		int sum = b1 + b2; 
		return Integer.toBinaryString(sum); 
	}
}
