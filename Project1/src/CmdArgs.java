
public class CmdArgs {

	public static void main(String[] args) {
		System.out.println("Args found: "+args.length);
		
		for(String s : args) {
			System.out.println(s);
		}
	}

}
