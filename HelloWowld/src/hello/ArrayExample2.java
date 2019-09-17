package hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] intAry = {{2,3,4}, {5,6,7}};
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry[i].length; j++) {
//				System.out.println("["+i+","+j+"=>"+intAry[i][j]+"]");
			}
				System.out.println();
		}
		System.out.println();

	
	
	int [][] aAry  = new int[5][5];
	int y = 0;
	for(int i = 0; i < aAry.length; i++) {
		for(int j = 0; j < aAry[i].length; j++) {
				y+=1;
				aAry[i][j] =y;
			System.out.print(aAry[i][j]+"|");
		}
		System.out.println();
	}
	}
}
	