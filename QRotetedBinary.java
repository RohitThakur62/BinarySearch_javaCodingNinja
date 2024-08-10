public class QRotetedBinary {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        
    }
    static int search(int[]nums,int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            return Binary(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        return pivot;


    }
    static int Binary(int[] a, int element,int s,int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2; // Correctly calculate the midpoint
            if (element < a[mid]) {
                e = mid - 1;
            } else if (element > a[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static int findPivot(int[] a){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;

            // 4 cases
            if(m < e && a[m]>a[m+1]){
                return m;
            }
            if(m>s&&a[m]<a[m-1]){
                return m;
            }
            if(a[m]<=a[s]){
                e=m-1;
            }
            else{
                s=m+1;
            }


        }
        return -1;
    }
}
