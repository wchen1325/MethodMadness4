public class WChenLib {
    public static boolean isPalindrome(String word){
        String Palindrome = "";
        for ( int i = 0; i <= word.length()-1; i++){
            Palindrome = word.substring (i, i+1) + Palindrome; //Creating a new String by adding letters backwards one by one.
        }
        return (Palindrome.equals(word)); //return true if the new string created is the same as the string given.
    }

    public static String datestr(String date){
        String month = date.substring(0,2); //isolate month, day, and year into individual strings.
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        return day + "-" + month + "-" + year;// return the strings in the new format.
    }


    public static boolean isFibonnaci (int n){
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        if (n == num1 || n == num2){ //check to see if the number is 0 or 1;
            return true;
        }
        else{
            while(num3 < n){ //creating the Fibonnaci number sequence until the the next number is greater than n.
                 num3 = num1 + num2;
                if (num3 == n){ //comparing n with each number in the sequence.
                    return true;
                }
                num1 = num2;
                num2 = num3;
            }
            return false;
        }
    }

    public static void multiplicationtable(int base, int range){
         for(int n=0; n <= range; n++){ //loop until the base has multiplied all integers from 0 to the range given.
             System.out.println(base*n);
         }
    }

    public static int leastCommonMultiple(int num1, int num2, int num3){
        int num1M = num1;
        int num2M = num2;
        int num3M = num3;
        while (num1 != num2 || num2 != num3){ //only the lower numbers will add itself until all numbers all equal.
            if (num1 < num2 || num1 < num3){
                num1 += num1M;
            }
            if (num2 < num1 || num2 < num3){
                num2 += num2M;
            }
            if (num3 < num1 || num3 < num2){
                num3 += num3M;
            }
        }
        return num1; //return any of the three number since all numbers are equal.
    }
}
