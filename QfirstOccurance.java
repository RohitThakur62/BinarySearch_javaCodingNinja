public class QfirstOccurance {
    public static void main(String[] args) {
        int[] arr={2,9,8,8,8,8,11,13};
        int target=8;
        int result=First(arr,target);
        System.out.println(result);
    }
    public static  int First(int[] a,int x){
        int l=0;
        int h=a.length-1;
        int first=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==x){
                first=m;
                h=m-1;
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
