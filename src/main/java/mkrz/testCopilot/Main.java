
package mkrz.testCopilot;

import java.util.Arrays;


public class Main
{
	public static void main(String [] P_args) 
	{
		System.out.println( "Hello ...");
		String [] values = { "One", "Two", "Three", "Four" };
		Arrays.sort(values);
		// comment afficher le tableau trié dans le sens inverse en utilisant la classe Collections ?
		// how to display the sorted array in reverse order using the Collections class?
		Arrays.sort(values, java.util.Collections.reverseOrder());
		for ( String v : values ) {
			System.out.println( v );
		}
		
	}
	
	public static String generateRandomUniqueLogin( int P_wishedLoginLength, java.util.Set<String> P_existingLogins ) 
	{
		String uniqueLogin = null;

		// Generate a random unique login having "P_wishedLoginLength" length and permuting letters and numbers
		
		return uniqueLogin;
	}

}