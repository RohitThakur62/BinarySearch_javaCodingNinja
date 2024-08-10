public class QceilingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,19,67,89};
        int target=17;
        int ans=Ceiling(arr,target);
        System.out.println(ans);
    }
    public static int Ceiling(int[] a,int num){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]<num){
                s=mid+1;

            }
            else if(a[mid]>num){
                e=mid-1;

            }
            else{
                return mid;
            }
        }
        return s;
    }
}
