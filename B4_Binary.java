//descending order
class B4_Binary{
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        int target=3;
        int ans=Binary(arr,target);
        System.out.println(ans);
    }
    static int Binary(int[] a,int element){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+e/2;
            if(element>a[mid]){
                e=mid-1;
                
            }
            else if(element<a[mid]){
                s=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
    

}
