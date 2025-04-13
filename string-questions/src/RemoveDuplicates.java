public class RemoveDuplicates {
  public static String removeDup(String string){
    StringBuilder result = new StringBuilder();
    boolean[] seen = new boolean[256];

    for(char ch : string.toCharArray()){
      if(!seen[ch]){
        seen[ch] = true;
        result.append(ch);
      }
    }

    return result.toString();
  }
}
