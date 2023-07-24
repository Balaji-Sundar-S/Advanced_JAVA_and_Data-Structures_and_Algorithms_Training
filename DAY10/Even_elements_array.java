package training;

import java.util.Scanner;

public class Even_elements_array {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int n, i;
		System.out.println("Enter number of elements : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for (i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("printing even placed elements");
		for (i = 0; i<n; i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
