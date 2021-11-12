package presentation;

public class Coin2Demo implements Coin{
	// Coin 인터페이스를 구현. Coin 인터페이스에 추상 메서드가 포함되지 않으므로
	// 따로 추가 할 코드가 없다.
	public static void main(String[] args) {
		
		System.out.println("Dime은 " +DIME+ "센트입니다.");
		// Coin 인터페이스의 구현 클래스로 직접 상수 사용이 가능하다.
	}
}
