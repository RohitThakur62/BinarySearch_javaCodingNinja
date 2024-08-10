public class QlastOccurance {
    public static void main(String[] args) {
        int[] arr={8,8,8,8,11,13};
        int target=8;
        int result=Last(arr,target);
        System.out.println(result);
    }
    public static  int Last(int[] a,int x){
        int l=0;
        int h=a.length-1;
        int first=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==x){
                first=m;
                l=m+1;
            }
            else if(a[m]<x){
                l=m+1;
                
            }
            else{
                h=m-1;
            }
        }
        return first;
    }
}
