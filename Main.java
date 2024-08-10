// Java Program to find the ceil and floor of an element in an array 
  
import java.io.*; 
import java.util.Scanner; 
  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        //Take input from the user
        Scanner sc=new Scanner(System.in);
        
        int n;    //Declare size of an array
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();    //Initialize the array size
        
        int arr[]=new int[n];   //Declare an array
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();    //Initialize the array elements
        }
        
        //Enter the element whose floor and ceil values you want to check
        int x;
        System.out.println("Enter the element whose floor and ceil values you want to check: ");
        x=sc.nextInt();
        
        //Method to check for Ceil
        int ceil=getCeil(arr,x);
        //Print the Ceil value
        System.out.println("Ceil value is "+ceil);
        
        //Method to check for Floor
        int floor=getFloor(arr,x);
        //Print the floor Value
        System.out.println("floor value is "+floor);
       
    }
    // Function to find the ceil of X in a sorted array A[],i.e., the smallest integer greater than or equal to X
    public static int getCeil(int[] A, int x)
    {
        // search space is A[left…right]
        int left = 0, right = A.length - 1;
 
        // initialize ceil to -1
        int ceil = -1;
 
        // loop till the search space is exhausted
        while (left <= right)
        {
            // find the mid-value in the search space
            int mid = (left + right) / 2;
 
            // if X is equal to the middle element, it is the ceil
            if (A[mid] == x) {
                return A[mid];
            }
 
            // if X is less than the middle element, the ceil exists in the subarray A[left…mid]; update ceil to the middle element and reduce our search space to the left subarray A[left…mid-1]
            else if (x < A[mid])
            {
                ceil = A[mid];
                right = mid - 1;
            }
 
            // if X is more than the middle element, the ceil exists in the right subarray A[mid+1…right]
            else 
            {
                left = mid + 1;
            }
        }
 
        return ceil;
    }
 
    // Function to find the floor of X in a sorted array A[], i.e., the largest integer less than or equal to X
    public static int getFloor(int[] A, int x)
    {
        int left = 0, right = A.length - 1;
 
        // initialize floor to -1
        int floor = -1;
 
        // loop till the search space is exhausted
        while (left <= right)
        {
            // find the mid-value in the search space
            int mid = (left + right) / 2;
 
            // if X is equal to the middle element, it is the floor
            if (A[mid] == x) 
            {
                return A[mid];
            }
 
            // if X is less than the middle element, the floor exists in the left subarray A[left…mid-1]
            else if (x < A[mid]) {
                right = mid - 1;
            }
 
            // if X is more than the middle element, the floor exists in the subarray A[mid…right]; update floor to the middle element and reduce our search space to the right subarray A[mid+1…right]
            else {
                floor = A[mid];
                left = mid + 1;
            }
        }
        return floor;
    }
}
