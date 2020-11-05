
public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJack(15,19));
	}
	
	public static Integer blackJack(int x, int y) {
		if(x <= 21 && y <= 21) {
			if(x > y) {
				return x;
			}
			return y;
		}
		else if(y > 21) {
			if(x > 21) {
				return 0;
			}
			return x;
		}
		else if(x > 21) {
			if(y > 21) {
				return 0;
			}
			return y;
		}
		
		return 0;
	}

}
