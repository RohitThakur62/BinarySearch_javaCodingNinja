import java.util.Arrays;

public class SearchInTwoD {
    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3},{4,5,6},{11,12,13},{90,98,28}};
        int[] ans=min(a,98);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] min(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
