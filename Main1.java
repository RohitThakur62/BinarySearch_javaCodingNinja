public class Main1 {

    static int[] printNumbers(int number){
        if(number<=0)
            return new int[-1];
        //else make a recursive call
        printNumbers(number-1);
        return new int[number];
        //print number in tail recursive
        
    }

    public static void main(String[] args) {
        int n = 20;
        printNumbers(n);
    }
}