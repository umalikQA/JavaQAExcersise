
public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unique(1,2,3));
	}
	
	public static Integer unique(int x, int y, int z) {
		int value = x + y + z;
		
		if(x == y || x == z) {
			value -= x;
		}
		
		if(y == z || y == x) {
			value -= y;
		}
		
		if(z == x || z == y) {
			value -= z;
		}
		
		return value;
	}

}
