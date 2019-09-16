package hello;

public class MathExample {
	public static void main(String[] args) {
		int a = 75;
		switch(a) {
		case 90:
			System.out.println("A등급");
			break;
		case 80:
			System.out.println("B등급");
			break;
		case 70:
			System.out.println("C등급");
			break;
		}
		if (a >= 90) {
			System.out.println(a + "A등급");
		} else if(a >=80) {
			System.out.println(a + "B등급");
		} else if (a >=70) {
			System.out.println(a + "C등급");
		}	
	
	
	
	
	}
}	
	
