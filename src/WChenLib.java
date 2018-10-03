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
}
