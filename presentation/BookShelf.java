package presentation;

//Shelf클래스 상속받아옴, Queue인터페이스 정의
public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// 배열에 받은 값 추가
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		//remove명령어를 이용해 맨앞에 있는 선반 반환
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
	//Shelf클래스의 getCount메서드 반환
		return getCount();
	}
	

}