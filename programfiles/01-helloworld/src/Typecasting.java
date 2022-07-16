
public class Typecasting {

	public static void main(String[] args) {
		
		String input="12";//only int will work
		
		// convert the string input into appropriate primitive datatype
		byte mybyte=Byte.parseByte(input);
		System.out.println("Byte val="+mybyte);
		
		int myint=Integer.parseInt(input);
		System.out.println("Integer val="+myint);


	}

}
