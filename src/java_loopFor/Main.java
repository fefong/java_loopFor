package java_loopFor;

/**
 * Example Application: LOOP - FOR
 * 
 * @author Felipe Fong
 */
public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 11; i++) {
			System.out.println("i: " + i);
		}

		int[] values = new int[] { 3, 4, 5 };
		for (int i = 0; i < values.length; i++) {
			System.out.println("i: " + values[i]);
		}

		int i;
		for (i = 10; i >= 0; i--) {
			System.out.println("i: " + i);
		}

		for (i = 0; i <= 10; i += 2) {
			System.out.println("i: " + i);
		}

		for (i = 10; i >= 0; i -= 2) {
			System.out.println("i: " + i);
		}
		
	}
}
