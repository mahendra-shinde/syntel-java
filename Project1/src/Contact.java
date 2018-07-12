
public class Contact {
	private String name;
	private String[] phone;

	public void printPhone() {
		for (String s : phone) {
			System.out.print(" " + s);
		}
		System.out.println();
	}

	public Contact(String name, String[] phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone = phone;
	}

}
