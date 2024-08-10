public class QlowerBound {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,7,8,9,9,9,11};
        int target=1;
        int ans=lower(arr,target);
        System.out.println(ans);
    }
    public static int lower(int[] a,int x){
        int answer=a.length;
        int low=0;
        int High=a.length-1;
        while(low<=High){
            int m=low+(High-low)/2;
            if(a[m]>=x){
                answer=m;
                High=m-1;

            }
            else{
                low=m+1;
            }
        }
        return answer;
    }
}
