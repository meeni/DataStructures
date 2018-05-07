package Array;
	public class SearchInRotatedSortedArray
	{
	    static int search(int arr[], int l, int h, int target)
	    {
	        if (l > h) 
	            return -1;
	        int mid = (l+h)/2;
	        if (arr[mid] == target)
	            return mid;
	        if (arr[l] <= arr[mid])
	        {
	            if (target >= arr[l] && target <= arr[mid])
	               return search(arr, l, mid-1, target);
	        return search(arr, mid+1, h, target);
	        }
	        if (target >= arr[mid] && target <= arr[h])
	            return search(arr, mid+1, h, target);
	       return search(arr, l, mid-1, target);
	    }
	    public static void main(String args[])
	    {
	        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
	        int n = arr.length;
	        int key = 6;
	        int i = search(arr, 0, n-1, key);
	        if (i != -1) 
	            System.out.println("Index: " + i);
	        else
	            System.out.println("Key not found");
	    }
	}
