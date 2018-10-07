public class WChenLib {
    public static boolean isPalindrome(String word){
        String Palindrome = "";
        for ( int i = 0; i <= word.length()-1; i++){
            Palindrome = word.substring (i, i+1) + Palindrome;
        }
        return (Palindrome.equals(word));
    }

    public static String datestr(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        return day + "-" + month + "-" + year;
    }



    public static boolean isFibonnaci (int n){
        String Strn = String.valueOf(n);
        int num1 = Integer.valueOf(Strn.substring(0,1));
        int num2 = Integer.valueOf(Strn.substring(1,2));
        String Fnum = String.valueOf(num1) + String.valueOf(num2);
        while(int i < String.valueOf(n).length()){
            int num3 = num1 + num2;
            Fnum = Fnum + String.valueOf(num3);
            num1 = num2;
            num2 = num3;
            i = Fnum.length();
        }
        return (Integer.valueOf(Fnum) == n)
    }
}
