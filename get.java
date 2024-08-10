public class get {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,19,67,89};
        int target=17;
        int ans=Ceiling(arr,target);
        int  z=Floor(arr,target);
        System.out.println(ans+" "+z);
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
                return a[mid];
            }
        }
        return a[s];
    }
    public static int Floor(int[] arr,int target){
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
