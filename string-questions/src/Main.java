public class Main {
    public static void main(String[] args) {

        //Basics
       //1. How do you declare a String in Java?
        String str = "Hello, World!";

        //2. How to find the length of a String?
        String str2 = "Java";
        System.out.println(str2.length());  // Output: 4

        //3. How to concatenate two Strings?
        String omkar = "Java Developer";
        String sam = "React Developer";
        System.out.println(omkar + " " + sam); //Java Developer React Developer

        //4. How to compare two Strings using equals()?
        String a = "Omkar";
        String b = "Prasad";
        System.out.println(a.equals(b)); //Output false

        //5. How to compare two Strings ignoring case?
        String dev = "OMKAR";
        String deva = "omkar";
        System.out.println(dev.equalsIgnoreCase(deva));//Output: true

        //6. How to check if a String is empty?
        String s = " ";
        System.out.println(s.isEmpty()); // Output: true

        //7. How to convert a String to uppercase?
        String op = "omkar patil";
        System.out.println(op.toUpperCase()); //OMKAR PATIL

        //8. How to convert a String to lowercase?
        String OP = "OMKAR PATIL";
        System.out.println(OP.toLowerCase());

        //9. How to get a character at a specific index?
        String findIndex = "iemdemod";
        System.out.println(findIndex.charAt(4));

        //10. How to get a substring from a String?
        String subString = "Hello World!";
        System.out.println(subString.substring(7));
        System.out.println(subString.substring(0, 5));

        //11. How to check if a String contains another String?
        String check = "Hello World!";
        System.out.println(check.contains("Om"));

        //12. How to check if a String starts with a specific prefix?
        String checkPref = "Hello World";
        System.out.println(checkPref.startsWith("He"));

        //13. How to check if a String ends with a specific suffix?
        String checkSuf = "Hello Om";
        System.out.println(checkSuf.endsWith("Om"));

        //14. How to replace characters in a String?
        String java = "JS is robust";
        System.out.println(java.replace("JS", "Java")); //Java is robust

        //15. How to remove whitespace from both ends of a String?
        String string = "     OMkar      ";
        System.out.println(string.trim());

        //16. How to split a String by a delimiter?
        String fruits = "Apple, Banana, Grapes";
        String[] arr = fruits.split(",");
        for(String fruit : arr){
            System.out.println(fruit);
        }

        //17. How to convert an integer to a String?
        int i = 10;
        String iString = String.valueOf(i);
        System.out.println(iString);

        //18. How to convert a String to an integer?
        String myString = "369";
        int myNumber = Integer.parseInt(myString);
        System.out.println(myNumber);

        //19. How to check if two Strings are equal using == and equals()?
        String p1 = new String("Java");
        String p2 = new String("Java");
        System.out.println(p1 == p2); //false diffrent objects
        System.out.println(p1.equals(p2)); //true same content

        //20. How to reverse a String?
        String revString = "AVAJ";
        String reversed = new StringBuilder(revString).reverse().toString();
        System.out.println(reversed);

        //21. How to remove vowels from a String?
        String remVowels = "Hello WOrld";
        String afterRemVow = remVowels.replaceAll("[AEIOUaeiou]", " ");
        System.out.println(afterRemVow);

        //22. How to check if a String is a palindrome?
        String checkPalindrome = "madam";
        boolean checkResult = checkPalindrome.equals(new StringBuilder(checkPalindrome).reverse().toString());
        System.out.println(checkResult);

        //23. How to count occurrences of a character in a String?
        String countOccurences = "Java Programming";
        long count = countOccurences.chars().filter(ch -> ch == 'a').count();
        System.out.println(count);

        //24. How to find the first non-repeating character in a String?
        Basics.checkNonRepeating("swiss");

        //25. How to find the longest word in a sentence?
        Basics.longestWord("Java is a greatest programming language");

        //Basics.returnDuplicates("straberry");
    }
}