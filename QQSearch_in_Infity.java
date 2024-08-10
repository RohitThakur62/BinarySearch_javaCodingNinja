public class QQSearch_in_Infity {
    public static void main(String[] args) {
        int[] a={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(a,target));

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
    public static int ans(int[] arr,int target){
        //first finding th range
        //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
        //first start with a box of size 2
        int s=0;
        int e=1;
        //condition for target to lie in the range
        while(target>arr[e]){
            int temp=e+1;//new start
            //double the box value
            //end=previous end +sizeofbox*2
            e=e+(e-s+1)*2;
            s=temp;
        }
        return Binary(arr,target,s,e);

    }

}
