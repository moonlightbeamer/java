import java.util.*;
public class excercise {
  public static void main(String[] args) {
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
  }
}