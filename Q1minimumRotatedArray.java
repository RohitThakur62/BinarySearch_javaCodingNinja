import java.util.*;

public class Q1minimumRotatedArray {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int min= Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                if (arr[low] < min) {
                    min=arr[low];
                    
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < min) {
                    min = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < min) {
                    
                    min = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println(ans);
    }
}