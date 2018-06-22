package generics;
import java.util.Scanner;
import java.util.Arrays;
/**
*
* @author Sahil
*/



public class GenericSort {
	
	public <p> void sorting (p arr[]) {    // used generic concept taught in class
		Arrays.sort(arr);
		System.out.println("Sorted array is :");
		for(int i =0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sl = new Scanner(System.in);
		System.out.println("Enter number of  elements you want in  integer type array-");
		int n = sl.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("Enter elements in integer array :");
		for(int i =0 ; i < n ; i++) {
			a[i] = sl.nextInt();
		}
		GenericSort x = new GenericSort();
		x.sorting(a);
		System.out.println("Enter number of elements you want in  string type array-");
		int m = sl.nextInt();
		String b[] = new String[m];
		System.out.println("Enter elements in string array :");
		for(int i = 0 ; i < m ; i++) {
			b[i] = sl.next();
		}
		x.sorting(b);
		sl.close();
	}

}
