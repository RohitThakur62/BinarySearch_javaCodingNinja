import java.util.*;
public class B3_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        //sort
        Arrays.sort(a);
        System.out.println("sorted arrays are:");
        System.out.println(Arrays.toString(a));
        
    }
}
