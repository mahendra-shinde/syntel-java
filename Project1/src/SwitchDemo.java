
public class SwitchDemo {

	public static void main(String[] args) {
		drawLine(50,"single");
		drawLine(70,"double");
		drawLine(80,"other");
	}

	
	public static void drawLine(int size,String style) {
		char ch ;
		switch(style) {
		case "single":
			ch = '-';
			break;
		case "double":
			ch = '=';
			break;
		case "dotted":
			ch = '.';
				break;
			default:
				ch='~';
		}
		for(int i=0;i<size;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
