class Solution12 {
    public static void main(String arg[]){
        printSquare(3);
    }

    public static void printSquare(int n) {

        // code here
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}