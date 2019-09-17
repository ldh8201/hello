package hello;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] intAry = new int[2][];
		intAry[0] = new int[3];
		intAry[1] = new int[4];
		int a = 1;
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = a++;
			}
			System.out.println();
		}
		
	}
}
//		=> intAry[0] => 합:27.
//		=> intAry[1] => 합:50.
//		for(int i = 0; i < intAry.length; i++) {
//			for(int j = 0; j < intAry[i].length; j++) {
//			System.out.printf("%2d", intAry[i][j]);
//			}
//		}	
//		System.out.println();
//	}
//}
