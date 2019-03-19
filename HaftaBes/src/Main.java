
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(faktoriel(50));
		System.out.println(faktorielfor(50));
		yildiz(5);
		
		Demo demo = new Demo();
		demo.hello();
		TestActivity activity = new TestActivity();
		activity.getUserName();
	}
	public static int faktoriel(int number) {
		if(number == 1) {
			return 1;
		}
		
		int result = number * faktoriel(number -1);
		return result;
		
	}
	public static int faktorielfor(int number) {
		int result = 1;
		for(int i=1;i<=number;i++) {
			result *= i;
		}
		return result;
	}
	public static void yildiz(int number) {
		for(int i = 0 ;i<number;i++) {
			for(int j = 0; j<number;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
