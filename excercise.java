import java.util.*;
public class excercise {

  public static class Student {
    String name;                          //data type
    int mark;

    public String record() {              // method
      String s = name + String.valueOf(mark);
      return s;
    }

    public Student(String n, int m) {     // constructor
      name = n;
      mark = m;
    }
  }

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
    /* substituting consonants
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
    */
    /*
    Scanner hp = new Scanner(System.in);
    int[] input = new int[11];
    for (int i=0; i<input.length; i++) {
      input[i] = hp.nextInt();
    }
    int sum = 0;
    for (int i=0; i<input.length; i++) {
      sum += input[i];
    }
    System.out.println("Sum is: " + sum);
    
    int max = input[0];
    for (int i=1; i<input.length; i++) {
      if (input[i] > max) {
        max = input[i];
      }
    }
    System.out.println("max is: " + max);
    hp.close();
    */
    /* https://dmoj.ca/problem/ccc16s2 tandem bicycle
    Scanner hp = new Scanner(System.in);
    int Question = hp.nextInt();
    int N = hp.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    for (int i=0; i<N; i++) {
      a[i] = hp.nextInt();
    }
    for (int i=0; i<N; i++) {
      b[i] = hp.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int speed = 0;
    if (Question==1) {
      // min
      for (int i=0; i<N; i++) {
        speed += Math.max(a[N-1-i], b[N-1-i]);
      }
      System.out.println("Min is: " + speed);
    } else if (Question==2) {
      // max
      for (int i=0; i<N; i++) {
        speed += Math.max(a[N-1-i], b[i]);
      }
      System.out.println("Max is: " + speed);
    } else {
      System.out.println("wrong question asked.");
    }
    hp.close();
    */
    /* https://www.dmoj.ca/problem/ccc15s2 jersey size
    Scanner hp = new Scanner(System.in);
    int J = hp.nextInt();
    int A = hp.nextInt();
    char[] js = new char[J];
    char[] as = new char[A];
    int[] an = new int[A];
    for (int i=0; i<J; i++) {
      // get qty J of size
      js[i] = hp.next().charAt(0);
    }
    for (int i=0; i<A; i++) {
      // get qty A of size - number pair
      as[i] = hp.next().charAt(0);
      an[i] = hp.nextInt();
    }
    int match = 0;
    for (int i=0; i<A; i++) {
      if (js[an[i]-1]<=as[i]) {
        js[an[i]-1] = 'X';  // if matched, meaning this number with the available size is taken, need to be marked not available, by give size X = extra small.
        match ++;
      }
    }
    System.out.println(match);
    for (int i=0; i<J; i++) {
      System.out.println(String.valueOf(js[i]));
    }
    hp.close();
    */
    /* https://dmoj.ca/problem/ccc19j3
    Scanner hp = new Scanner(System.in);
    int N = hp.nextInt();
    int count =1;
    for (int i=0; i<N; i++) {
      String line = hp.next() + " ";
      for (int j=0; j<line.length()-1; j++) {
        if (line.charAt(j+1) == line.charAt(j)) {
          count ++;
        } else {
          System.out.print(count + " " + line.charAt(j) + " ");
          count = 1;
        }
      }
      System.out.println();
    }
    hp.close();
    */
    /* https://www.dmoj.ca/problem/ccc21j3
    Scanner hp = new Scanner(System.in);
      String dir = "";
      for (;;) {
        int line = hp.nextInt();
        if (line == 99999) {
          break;
        } else {
          int check = (line/10000)+((line-10000*(line/10000))/1000);
          int steps = (line-1000*(line/1000));
          if (check==0) {
          } else if (check%2==0) {
            dir = "right";
          } else {
            dir = "left";
          }
          System.out.println(dir + " " + steps);
        }
      }
    hp.close();
    */
    ///* 
    Student lin = new Student("lin", 100);
    System.out.println(lin.name);
    System.out.println(lin.mark);
    System.out.println(lin.record());
    //*/
  }
}