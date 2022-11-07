								                          ASSIGNMENT-2(I NEURON)


Sol-1)-Solution

package in.neuron.com.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int len = sc.nextInt();
		int[] ar = new int[len];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < len; i++) {
			ar[i] = sc.nextInt();
		}
		Arrays.sort(ar);
		int[] arr = new int[len];
		int i = 0;
		int count = 0;
		while ((i + 1) < ar.length) {
			if ((ar[i]) == ar[i + 1]) {
				arr[count] = ar[i];
				count++;
				i++;
			} else {
				i++;

			}

		}
		if (count > 0) {
			System.out.print("Duplicate element in the Array: ");
			for (int j = 0; j < count; j++) {
				if (arr[j] != arr[j + 1]) {
					System.out.print(arr[j] + " ");
				}
			}
		} else {
			System.out.println("No Duplicate Element in the Array");
		}
		sc.close();
	}
}


Q-2)-Solution


package in.neuron.com.Assignment2;

import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the Elements of the Array");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		QuickSort qsm = new QuickSort();
		qsm.quickSortRecursion(arr, 0, n - 1);
		qsm.printArray(arr);
	}

	int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}

		return low;

	}

	void quickSortRecursion(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSortRecursion(arr, low, pi - 1);
		}
		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}

	void printArray(int[] arr) {
		System.out.println("Sorted Array using Quick Sort Sort is : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}


Q-3)-Solution


package in.neuron.com.Assignment2;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the Array");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("Sorted Array using Bubble Sort is : ");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}

}


Q-4)-Solution

package in.neuron.com.Assignment2;

import java.util.Scanner;

public class MergeSort {
		int[] array;
		int[] tempMergeArr;
		int length;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the Elements of the Array");
		int[] inputArr = new int[n];
		for (int i = 0; i < n; i++) {
			inputArr[i] = sc.nextInt();
		}
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		
		System.out.println("Sorted Array using Merge Sort is : ");
		for(int i:inputArr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
	
	public void sort(int[] inputArr) {
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lowerIndex,int higherIndex ) {
		if(lowerIndex<higherIndex) {
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			//below recursion  will sort the left side of an array
			divideArray(lowerIndex,middle);
			//below recursion will sort the right side of an  array 
			divideArray(middle+1,higherIndex);
			
			mergeArray(lowerIndex,middle,higherIndex);
			
		}
	}
	
	public void mergeArray(int lowerIndex,int middle,int higherIndex) {
		
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempMergeArr[i]= array[i];
		}
		
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				array[k]=tempMergeArr[i];
				i++;
			}
			else {
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k]=tempMergeArr[i];
			k++;
			i++;
			
		}
		
	}
}


Q-5)-Solution

package in.neuron.com.Assignment2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the Array");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int min,temp=0;
		for(int i=0;i<n;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			
		}
		System.out.println("Sorted Array using Selection Sort is : ");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}

		
	}

}


Q-6)-Solution

package in.neuron.com.Assignment2;
import java.util.*;
public class SubSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the Array");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of the Sub Array");
		int size=sc.nextInt();
		System.out.println("Enter the Elements of Sub Array");
		int [] ar=new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<n;j++) {
				if(ar[i]==arr[j]) {
					count++;
				}
			}
		}
		if(count==size) {
			System.out.println("Desired Array is a subset");}
		else{
			System.out.println("Desired Array is not a Subset");
		}
		}
	}



