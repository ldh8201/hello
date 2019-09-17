package hello;

import java.util.Scanner;

public class GetMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xy = 0;
		Scanner sc = new Scanner(System.in);
			int[] intAry = new int[5];
		for(int i = 0; i < intAry.length; i++) {
			System.out.println("데이타 입력:");
			intAry[i] = sc.nextInt();
		}
		int aAry = 0;	
		for(int i = 0; i < intAry.length; i++) {		
			aAry = (aAry > intAry[i] ? aAry : intAry[i]);
		}
		System.out.println("가장 큰 값은 : " + aAry);
}
}