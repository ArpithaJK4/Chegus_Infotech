import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sise:");
		int size=sc.nextInt();
	
		int[] arr=new int [size];
		System.out.println("enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter the nth:");
		int n=sc.nextInt();
		Arrays.sort(arr);
			System.out.println( arr[arr.length-n]);
		}
		
}
