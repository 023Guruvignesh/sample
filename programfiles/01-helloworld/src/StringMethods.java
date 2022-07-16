
public class StringMethods {

	public static void main(String[] args) {
		
		String s="Hello world";
		System.out.println(s);
		System.out.println("Length=" +s.length());
		
		System.out.println("Index of w=" + s.indexOf('w'));

		//print the character at position 3
		System.out.println("Character at 3="+s.charAt(12));
		//
		System.out.println("Command after exception");
		
		System.out.println("Index of 1="+s.indexOf('1'));
		System.out.println("Index of second 1="+s.indexOf('1',3));
		System.out.println("Index of third 1");
		
		
	}

}
