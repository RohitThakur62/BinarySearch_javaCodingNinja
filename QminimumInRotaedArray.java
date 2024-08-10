import java.util.*;
public class QminimumInRotaedArray {
    private static final int INT_MAX = 0;

    public static void main(String[] args) {
        int [] a={4,5,1,2,3};
        int r=Search(a);
        System.out.println(r);
        
    }
    public static int Search(int[] a){
        int l=0;
        int h=a.length-1;
        int ans= Integer.MAX_VALUE;
        while(l<=h){
            int m=(l+h)/2;
            if(a[l]<=a[h]){
                ans=a[l];
                break;
            }
            if(a[l]<=a[m]){
                ans =Math.min(ans,a[l]);
                l=m+1;
            }
            else{
                ans =Math.min(ans,a[m]);
                h=m-1;
            }
        }
        return ans;
    }

}
