public class QSquareroot {
    public static void main(String[] args) {
        int x=144;
        int ans=sqrt(x);
        System.out.println(ans);
    }
    public static int sqrt(int x){
        int y=0;
        while(y*y<=x){
            y++;
        }
        return (int)y-1;
    }
}
