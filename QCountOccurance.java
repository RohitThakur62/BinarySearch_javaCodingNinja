class QCountOccurance{
    public static void main(String arg[]){
        int a[] ={1,1,1,2,2,3,3};
        int x=1;
        int res=Count(a,x);
        System.out.println(res);
    }
    public static int Count(int[] a,int x){
        int l=0;
        int h=a.length-1;
        int count=0;
        for(int i=0;i<a.length;i++){

            if(a[i]==x){
                count++;

            }
        }
        return count;
    }
}