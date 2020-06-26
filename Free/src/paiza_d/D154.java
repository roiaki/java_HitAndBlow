package paiza_d;

import java.util.Scanner;

public class D154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisionNum = sc.nextInt();
		int personNum = sc.nextInt();

		int totalDivision = divisionNum * divisionNum;

		int ans = totalDivision - personNum;

		System.out.println(ans);
	}
}
