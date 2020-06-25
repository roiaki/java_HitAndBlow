package paiza_d;

import java.util.Scanner;

public class D137 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		char ans = 'y';
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ans) {
				count++;
			}
		}
		System.out.println(count);
	}
}
