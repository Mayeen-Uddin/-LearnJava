package Args;
		/**
 * @author Mayeen
 * This program uses command line
 * arguments as input.
 */
public class ComLineArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int count, i = 0;
		String string;
		count = args.length;
		System.out.println("Number of arguments = " + count);
		while (i < count)
		{
			
			string = args[i];
			i = i + 1;
			System.out.println(i + " : " + "Java is " + string+ "!");
			
		}

	}
}


