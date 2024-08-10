public class A3linearsearch02 {
    public static void main(String[] args) {
        String str="Rohit";
        char target='o';
        boolean ans=Linearsearch(str,target);
        System.out.println(ans);
    }
    public static boolean Linearsearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;//mil gaya to true
            }
        }
        return false;//nhi to false
    }
}
