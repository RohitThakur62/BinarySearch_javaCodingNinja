//1672. Richest Customer Wealth
public class Richest{
    public static void main(String arg[]){
        int[][] a={{1,5},{7,3},{3,5}};
        int ans=maximumwealth(a);
        System.out.println(ans);
    }
    public static int maximumwealth(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}