public class Basics {

    //24. How to find the first non-repeating character in a String?
    public static void checkNonRepeating(String checkString){
        for(char c: checkString.toCharArray()){
            if(checkString.indexOf(c) == checkString.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
    }

    //25. How to find the longest word in a sentence?
    public static void longestWord(String checkString){
        String[] tempArr = checkString.split(" ");
        String longest = "";
        for(String word : tempArr){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
    }

    //26. Find duplicate characters in a String.
    public static void returnDuplicates(String checkString){
        for(char ch: checkString.toCharArray()){
            if(checkString.indexOf(ch) != checkString.lastIndexOf(ch)){
                System.out.println(ch);
            }
        }
    }

}
