public class QfindPivot {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        
    }
    public static int findPivot(int[] a){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;

            // 4 cases
            if(m < e && a[m]>a[m+1]){
                return m;
            }
            if(m>s&&a[m]<a[m-1]){
                return m;
            }
            if(a[m]<=a[s]){
                e=m-1;
            }
            else{
                s=m+1;
            }


        }
        return -1;
    }
}
