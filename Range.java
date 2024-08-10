import java.util.*;
public class Range{
    public static void main(String arg[]){
        int[] a={1,2,3,4,7,8};
        int target=4;
        int ans=search(a,4,1,5);
        System.out.println(ans);

    }
    public static int search(int[] arr,int target,int s,int e){
        if(arr.length==0){
            return -1;
        }
        for(int i=s;i<=e;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}