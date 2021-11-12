package presentation;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("태백산맥1");
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		//queue방식대로 들어간순서대로 먼저꺼내짐 (first-in-out)
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
}