public class Q9squarerootBinarySearch {
    public static void main(String[] args) {
        int n=9;
        long ans=SquareRoot(n);
        System.out.println(ans);
    }
    public static int SquareRoot(int n){
        int l=1;
        int h=n;
        long ans=0;
        while(l<=h){
            int m=(l+h)/2;
            if(m*m<=n){
                ans=m;
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return (int)ans;

    }
}
