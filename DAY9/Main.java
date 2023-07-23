import java.util.*;
import java.io.*;

public class Main {
    
    public static void main (String args[]) {
        
        Scanner sc = new Scanner (System.in);
        int n, i;
        System.out.println("Enter number of values : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter values : ");
        for (i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int small = arr[0];
        for (i = 1; i<n; i++){
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest number in array : " + small);
        
    }
}
