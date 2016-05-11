/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
 
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
	
		String stat = "Computer Science is the best, the greatest, and the most wonderful subject to study!  ";
	 int ind = stat.indexOf("the",0);
	 int count = 0;
		while(ind>=0)
		{
			count++;
			ind = stat.indexOf("the",ind+1);
			
		}
	
		System.out.println("Numbers of times the word the appears " + count);
		
		
	
	
	 

	}

}
