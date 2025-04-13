public class CountVowelsandConsonants {
    public static void count(String string){
        int vowels = 0, consonants = 0;
        string = string.toLowerCase();

        for(char ch: string.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }

        System.out.println("Vowels in the string: " + vowels);
        System.out.println("Consonants in the string: " + consonants);
    }
}
