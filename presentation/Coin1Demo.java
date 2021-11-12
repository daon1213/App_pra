package presentation;

// 상수 필드 선언
interface Coin{
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
	// int로 표기됬지만, public static final int이다. 인터페이스의 모든 필드는 public
	// static final이기 때문이다.
}

public class Coin1Demo{
	public static void main(String[] args) {
		System.out.println("Dime은 " +Coin.DIME+ "센트입니다.");
		// DIME = 인터페이스 정의 상수인 DIME을 의미한다.

	}

}
