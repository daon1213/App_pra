package presentation;

import java.util.ArrayList;

public class Shelf {

	//상속받을때 사용할 수 있는 protected 접근제어자 선언
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf=new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
	
	
}
