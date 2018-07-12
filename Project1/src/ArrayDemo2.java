
public class ArrayDemo2 {

	public static void main(String[] args) {
		Contact[] contacts = new Contact[3];
		contacts[0] = new Contact("Kangana", new String[] { "646546542", "456546465" });
		contacts[1] = new Contact("Dipeeka", new String[] { "845454546", "955465465" });
		contacts[2] = new Contact("Alia", new String[] { "6545412212" });

		for (Contact c : contacts) {
			System.out.println("Contact name: " + c.getName());
			System.out.println("Phone : ");
			c.printPhone();
		}
	}
}
