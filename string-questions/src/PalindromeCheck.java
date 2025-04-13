public class PalindromeCheck {
    public static boolean checkPalindrome(String string){
        int left = 0, right = string.length() - 1;
        while (left < right){
            if(string.charAt(left++) != string.charAt(right--)) return false;
        }
        return true;
    }
}
