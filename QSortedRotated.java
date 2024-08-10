//leetcode 33
public class QSortedRotated {
    public static void main(String[] args) {
        int[] a={7,8,9,1,2,3,4,5,6};
        int target=1;
        int ans=search(a,target);
        System.out.println(ans);//3
    }
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length- 1;
   while (low <= high) {
       int mid = (low + high) / 2;

       //if mid points the target
       if (nums[mid] == target) return mid;

       //if left part is sorted:
       if (nums[low] <= nums[mid]) {
           if (nums[low] <= target && target<= nums[mid]) {
               //element exists:
               high = mid - 1;
           }
           else {
               //element does not exist:
               low = mid + 1;
           }
       }
       else { //if right part is sorted:
           if (nums[mid] <= target && target <= nums[high]) {
               //element exists:
               low = mid + 1;
           }
           else {
               //element does not exist:
               high = mid - 1;
           }
       }
   }
   return -1;
       
   }
}
