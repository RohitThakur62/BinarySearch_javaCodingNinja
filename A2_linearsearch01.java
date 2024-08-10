public class A2_linearsearch01 {
    public static int linear(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int s=41;
        int f=linear(a,4);
        System.out.println("found at index"+f);

    }
}
