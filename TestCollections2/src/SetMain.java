import java.util.*;

public class SetMain {

	public static void main(String[] args) {
		Set<Country> set = new HashSet<>();
		
		set.add(new Country("india","rupees"));
		set.add(new Country("sri lanka","srilankan rupees"));
		set.add(new Country("india","INR"));
		
		Iterator<Country> it = set.iterator();
		while(it.hasNext()) {
			Country c = it.next();
			System.out.println(c.getName()+" "+c.getCurrency());
		}
	}

}
