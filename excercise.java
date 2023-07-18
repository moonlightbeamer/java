import java.util.*;
public class excercise {
  public static void main(String[] args) {
    /* accepting input of multiple integers in one line
      Scanner hp = new Scanner(System.in);
      int[] x = new int[10];
      for (int i=0; i < 10; ++i) {
        x[i] = hp.nextInt();
      }
      hp.nextLine();
      String line = hp.nextLine();
      for (int i=0; i < 10; ++i) {
        System.out.print(x[i]+":");
      }
      System.out.println();
      System.out.println(line);
      hp.close();
    */
    ///* substituting consonants
    Scanner hp = new Scanner(System.in);
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String vowel = "aeiou";
    String consonant = "bcdfghjklmnpqrstvwxyzz";
    String input = hp.next();
    for (int i=0; i<input.length(); i++) {
      if (vowel.contains(String.valueOf(input.charAt(i)))) {
        System.out.print(input.charAt(i));
      } else if (input.charAt(i) > 'u') {
        System.out.print(input.charAt(i) + "u" + consonant.charAt(consonant.indexOf(String.valueOf(input.charAt(i)))+1));
      } else {
        String sort = vowel + String.valueOf(input.charAt(i));
        int[] indexes = new int[6];
        for (int j=0; j<6; j++) {
          indexes[j] = alphabet.indexOf(String.valueOf(sort.charAt(j)));
        }
        int target = indexes[5];
        Arrays.sort(indexes);
        int k = Arrays.binarySearch(indexes, target);
        int r1 = indexes[k] - indexes[k-1];
        int r2 = indexes[k+1] - indexes[k];
        if (r1 <= r2) {
          System.out.print(String.valueOf(input.charAt(i)) + alphabet.charAt(indexes[k-1]) + consonant.charAt(consonant.indexOf(String.valueOf(input.charAt(i)))+1));
        } else {
          System.out.print(String.valueOf(input.charAt(i)) + alphabet.charAt(indexes[k+1]) + consonant.charAt(consonant.indexOf(String.valueOf(input.charAt(i)))+1));
        }
      }
    }
    hp.close();
  }
}