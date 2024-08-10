//leetcode 33
public class QSortedRotatedDistinct {
    public static void main(String[] args) {
        int[] a={3,7,8,9,1,2,3,3,3,4,5,6,3};
        int target=3;
        boolean ans=search(a,target);
        System.out.println(ans);//3
    }
    public static boolean search(int[] nums, int target) {
        int low = 0, high = nums.length- 1;
   while (low <= high) {
       int mid = (low + high) / 2;

       //if mid points the target
       if (nums[mid] == target) return true;;
       if(nums[mid]==nums[low]&&nums[mid]==nums[high]){
        low=low+1;
        high=high--;
        continue;
       }

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
   return false;
       
   }
}
