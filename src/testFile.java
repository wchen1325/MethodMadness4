public class testFile {
    public static void main (String[] args)
    {
        System.out.println("Hello Method Madness");
        //Methods
        System.out.println(WChenLib.isPalindrome("racecar")); //Input a String word to check if it is a palindrome.
        System.out.println(WChenLib.datestr("10/19/1999")); //reformatting mm/dd/yyyy to dd - mm - yyyy.
        System.out.println(WChenLib.isFibonnaci(56));
        System.out.println(WChenLib.isSequenceFibonnaci(2141553));
        WChenLib.multiplicationtable(3,9);
        System.out.println(WChenLib.leastCommonMultiple(50,23,13));
    }
}
