package hello;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b = 20, c = 30;
		int sum = 10;
		int [] intAry = { 10, 20, 30, 40, 50, 60 };
		String[] strAry = { "Nice", "Good", "hello"};
		System.out.println(intAry[0]);
		System.out.println(strAry[0]);
		for (int i = 0; i < 6; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("strAry의 크기 : " + strAry.length);
		strAry[0] = "NNice";
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
			
		}
	
		int[] aAry = new int[5];
		aAry[0] = 10;
		aAry[1] = 20;
		aAry[2] = 30;
		aAry[3] = 40;
		aAry[4] = 50;
	}

}
////

			
			