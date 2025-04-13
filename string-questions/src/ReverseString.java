public class ReverseString {
    public static String reverse(String string){
        StringBuilder str = new StringBuilder(string);
        return str.reverse().toString();
    }
}
