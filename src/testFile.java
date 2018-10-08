public class testFile {
    public static void main (String[] args)
    {
        System.out.println("Hello Method Madness");
        //Methods
        System.out.println(WChenLib.isPalindrome("racecar")); //Input a String word to check if it is a palindrome.
        System.out.println(WChenLib.datestr("10/19/1999")); //reformatting mm/dd/yyyy to dd - mm - yyyy.
        System.out.println(WChenLib.isFibonnaci(56)); //Check if a number is in the Fibonnaci sequence.
        WChenLib.multiplicationtable(3,9); //Find multiples of a number up to a cap.
        System.out.println(WChenLib.leastCommonMultiple(50,23,13)); //Find the least common multiple of three numbers.
    }
}
