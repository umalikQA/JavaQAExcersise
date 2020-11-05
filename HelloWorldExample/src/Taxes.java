
public class Taxes {

	public static void main(String[] args) {
		Taxes usama = new Taxes();
		usama.method2(63500);
	}
	
	public double method1(double salary) {
		int taxPercent = 0;
		
		if(salary >= 45000) {
			taxPercent = 25;
		}
		else if(salary >= 30000) {
			taxPercent = 20;
		}
		else if(salary >= 20000) {
			taxPercent = 15;
		}
		
		return taxPercent;
	}
	
	public double method2(double salary) {
		double totalToPay = salary * (method1(salary)/100); 
		print("Tax to pay: " + totalToPay);
		return totalToPay;
	}
	
	public static void print(String x) {
		System.out.println(x);
	}
	
	public static void print(double x) {
		System.out.println(x);
	}

}
