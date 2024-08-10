//find number with even number of digits
public class Q1EvenDigit {
    public static void main(String[] args) {
        int[] a={18,124,9,1764,98,1,90,123456,89};
        even(a);
    }
    public static void even(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int digit=0;
            while(arr[i]>0){
                digit++;
                arr[i]=arr[i]/10;
            }
            if(digit%2==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
