public class QfloorNumber {
    public static void main(String[] args) {
        int[] a={2,3,5,9,14,16,18};
        int num=17;
        int ans=BinarySearch(a,num);
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
    
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[e];
    }
    
}
