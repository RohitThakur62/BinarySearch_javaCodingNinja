import java.util.*;

public class Q2IndexRotatedArray {
    public static int findKRotation(int[] a) {
        int l = 0, h = a.length - 1;
        int min= Integer.MAX_VALUE;
        int index = -1;
       while(l<=h){
        int m=(l+h)/2;
        if(a[l]<=a[h]){
            min=a[l];
            index=l;
            break;
        }
        else if(a[l]<=a[m]){
            if(a[l]<min){
                min=a[l];
                index=l;
            }
            else{
                l=m+1;
            }
        }
        else{
            if(a[m]<min){
                min=a[m];
                index=m;
            }
            else{
                h=m-1;
            }
        }
        
       }
       return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("times"+ans);
    }
}