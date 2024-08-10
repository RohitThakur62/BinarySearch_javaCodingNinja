
class Search{
    public static void main(String[] args) {
        int[] a={1,2,4,7};
        int n=3;//insert
        int result=Insert(a,n);
        System.out.println(result);

    }
    public static int Insert(int[] arr,int x){
        int l=0;
        int h=arr.length-1;
        int ans=arr.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>=x){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}