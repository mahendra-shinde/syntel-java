
public class ArrayDemo {

	public static void main(String[] args) {
		//Create an Array of 3 String Arrays 
		String[] contacts[] = new String[3][];
		//First Contacts
		contacts[0]=new String[3];
			contacts[0][0] = "Kangana";
			contacts[0][1] = "721554454";
			contacts[0][2] = "45454865";
		//Second contact
		contacts[1]=new String[5];
			contacts[1][0] = "Deepika";
			contacts[1][1] = "985694342";
			contacts[1][2] = "954548785";
			contacts[1][3] = "65545543";
			contacts[1][4] = "53454545";
		//Third contacts
		contacts[2]=new String[2];
			contacts[2][0] = "Alia";
			contacts[2][1] = "654654654";
			
		/*System.out.println("My (fake) Contacts");
		for(String[] contact : contacts) {
			System.out.println("Contact name: "+contact[0]);
			System.out.print("Phone numbers ");
			for(int i=1;i<contact.length;i++) {
				System.out.print(contact[i]+" ");
			}
			System.out.println();
		}
		*/
		
		System.out.println("My (fake) Contacts");
		for(int j=0;j<contacts.length;j++) {
			System.out.println("Contact name: "+contacts[j][0]);
			System.out.print("Phone numbers ");
			for(int i=1;i<contacts[j].length;i++) {
				System.out.print(contacts[j][i]+" ");
			}
			System.out.println();
		}
	}

}
