//Bruteforce
public class Q3SingleElementInArray {
    public static int single(int[] a){
        int n=a.length-1;
        if (n == 1){
        return a[0];
        
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(a[i]!=a[i+1]);
                return a[i];

            }
            else if(i==n-1){
                if(a[i]!=a[i-1]){
                    return a[i];
                }
            }
            else{
                if(a[i]!=a[i-1]&&a[i]!=a[i+1]){
                    return a[i];
                }
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,4,5,6,6};
        int ans=single(a);
        System.out.println("single="+ans);
    }
    
}
