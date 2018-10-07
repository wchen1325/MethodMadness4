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

    public static boolean isSequenceFibonnaci (int n){
        String Strn = String.valueOf(n);
        int num1 = Integer.valueOf(Strn.substring(0,1));
        int num2 = Integer.valueOf(Strn.substring(1,2));
        String Fnum = String.valueOf(num1) + String.valueOf(num2);
        int i = 0;
        while( i < String.valueOf(n).length()){
            int num3 = num1 + num2;
            Fnum = Fnum + String.valueOf(num3);
            num1 = num2;
            num2 = num3;
            i = Fnum.length();
        }
        return (Integer.valueOf(Fnum) == n);
    }

    public static boolean isFibonnaci (int n){
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        if (n == num1 || n == num2){
            return true;
        }
        else{
            while(num3 < n){
                 num3 = num1 + num2;
                if (num3 == n){
                    return true;
                }
                num1 = num2;
                num2 = num3;
            }
            return false;
        }
    }

    public static void multiplicationtable(int base, int range){
         for(int n=0; n <= range; n++){
             System.out.println(base*n);
         }
    }

    public static int leastCommonMultiple(int num1, int num2, int num3){
        int num1M = num1;
        int num2M = num2;
        int num3M = num3;
        while (num1 != num2 || num2 != num3){
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
        return num1;
    }
}
