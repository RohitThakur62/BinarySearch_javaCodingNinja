import java.util.*;
public class A4_Min{
    public static void main(String arg[]){
        int[] a={1,2,3,4,7,8};
        int ans=searchmin(a);
        System.out.println(ans);

    }
    public static int searchmin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
}