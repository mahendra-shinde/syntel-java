import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Country> countries = new ArrayList<>();
		countries.add(new Country("India", "Rupees"));
		countries.add(new Country("KSA", "Riyal"));
		countries.add(new Country("USA", "Dollar"));
		countries.add(1, new Country("UK", "Euros"));
		countries.add(new Country("Japan", "Yen"));
		countries.add(2, new Country("Nepal", "Nepalees Rupee"));

		/*
		 * ListIterator<Country> it = countries.listIterator(); while(it.hasNext()) {
		 * Country c = it.next(); System.out.println(c.getName()+" "+c.getCurrency()); }
		 * System.out.println("Now, list in reverse"); while(it.hasPrevious()) {
		 * System.out.println(it.previous().getName()); }
		 */

		TreeSet<Country> tset = new TreeSet<>(countries);
		for (Country c : tset) {
			System.out.println(c.getName());
		}

	}

}
