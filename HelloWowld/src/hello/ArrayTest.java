package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
////			Scanner sc = new Scanner(System.in);
		/// System.out.println("input int type");
		/// int a = sc.nextInt();
		/// System.out.println("next input");
		//// int b = sc.nextInt();
		/// System.out.println("next input");
		/// int c = sc.nextInt();
		/// int sum = a + b + c;
		/// System.out.println("합은: " + sum);
		int[] intAry = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(" 데이타입력:");
			intAry[i] = sc.nextInt();
		}
		for (int i = 0; i < intAry.length; i++){
			System.out.println(intAry[i]);
		}
	}

}
