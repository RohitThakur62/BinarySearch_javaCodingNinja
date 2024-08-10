public class Q8squareroot {
    public static void main(String[] args) {
        int x=9;
        int ans=0;
        for (int i = 1; i <= x; i++) {
            if (i*i <= x) {
                ans =  i;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
    
}
