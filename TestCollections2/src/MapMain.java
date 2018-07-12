import java.util.*;

public class MapMain {

	public static void main(String[] args) {
		Map<String,Country> countries = new HashMap<>();
		countries.put("IN", new Country("India","Indian Rupees"));
		countries.put("US", new Country("United States","US Dollar"));
		countries.put("CN",new Country("China","Chinese Renminbi"));
		countries.put("JP",new Country("Japan","Yen"));
		
		
		Country c = countries.get("IN");
		System.out.println("Name : "+c.getName());
	}

}
