import java.util.*;

public class DequeMain {
	private Deque<Country> stack = new ArrayDeque<>();
	
	public static void main(String[] args) {
		DequeMain main = new DequeMain();
		System.out.println("Adding India");
		main.add(new Country("INDIA","RUPEES"));
		System.out.println("Adding Nepal");
		main.add(new Country("NEPAL","Nepalese RUPEE"));
		
		Country c = main.get();
		System.out.println("Popped "+c.getName());
		System.out.println("Adding Bhutan");
		main.add(new Country("BHUTAN","Bhutan RUPEE"));
		
	}

	//add new country (push)
	void add(Country c) {
		stack.push(c);
	}
	//Get last country from the stack
	Country get() {
		return stack.pop();
	}
}
