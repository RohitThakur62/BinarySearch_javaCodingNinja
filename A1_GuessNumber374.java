import java.util.*;
public class A1_GuessNumber374 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //printing
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("pick element");
        int pick=sc.nextInt();
        System.out.println("picked element is"+pick);

        int ans=guess(arr,pick,n);
        System.out.println("Avaolable"+ans);
    }
        //picking number and compare with array
        public static int guess(int[] arr,int pick,int n){
            for(int i=0;i<n;i++){
                if(arr[i]==pick){
                    return i;
                }
            }
            return -1;
     }

}
