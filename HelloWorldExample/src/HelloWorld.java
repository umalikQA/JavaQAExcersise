
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(div(2,3));
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static Integer sum(int one, int two) {
		return one+two;
	}
	
	public static Integer subtraction(int one, int two) {
		return one-two;
	}
	
	public static Integer times(int one, int two) {
		return one*two;
	}
	
	public static Double div(double one, double two) {
		if(one < two) {
			return one/two;
		}
		System.out.println("First parameter has to be smaller than the second!");
		return null;
	}
	
}
