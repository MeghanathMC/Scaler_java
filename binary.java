package basic;
import java.util.*;
public class binary {
	static int binarysearch(int arr[],int low,int high,int key) {
		if(low>high) {
			return -1;
		}
		else {
			 int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]) {
				return binarysearch(arr,mid+1,high,key);
			}
			else {
				return binarysearch(arr,low,mid-1,key);
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,6,7,8,10,14};
		int n=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key element to search");
		int key=sc.nextInt();
		
		
		
		System.out.println("Index :  " + binarysearch(arr,0,n-1,key));
		
		
	}

}
