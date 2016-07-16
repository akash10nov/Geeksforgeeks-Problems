import java.io.*;
import java.util.*;
public class quicksort

{
    public static void main(String[] akash)
    {
        System.out.println("enter the size and then the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n=size;
        int[] in=new int[n];
        for(int i=0;i<n;i++)
            in[i]=sc.nextInt();
        quickSort(in,0,n-1);
        for(int i=0;i<n;i++)
            System.out.println(in[i]);
    }
    public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}
