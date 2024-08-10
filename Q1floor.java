public class Q1floor {
    public static void main(String[] args) {
        int[] a={3, 4, 4, 7, 8, 10};
        int n=5;
        int ans=getFloor(a,n);
        System.out.println(ans);
        
    }
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
