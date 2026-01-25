public class String2 {
    public static boolean palindrome(String s){
        int j=s.length()-1;
        for(int i=0;i<(s.length())/2; i++){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("no");
                return false;
            }
            j--;
        }
        System.out.println("yes");
        return true;
    }


    public static boolean palindromecase(String y){
        int j=y.length()-1;
        String s= y.toLowerCase();
        for(int i=0;i<(s.length())/2; i++){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("no");
                return false;
            }
            j--;
        }
        System.out.println("yes");
        return true;
    }

    public static void main(String[] args){
        String s= "racecar";
        String x="RacecAr";
        palindrome(s);
        palindromecase(x);
    }
}
