//© A+ Computer Science  -  www.apluscompsci.com
//Name - Kumaran Arulmani and Troy the ID10T
//Date -
//Class - 
//Lab  -

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>(0);

	}

	//modfiers
	public void add(String  word)
	{
		for(String i : list)
		{
			if(i.equals(word))
				break;
		}
		list.add(word);
		Collections.sort(list);

	}


	public void remove(String word)
	{
		list.remove(word);

	}

	public String toString( )
	{
		return list.toString().replaceAll("[\\[\\]]","").replaceAll(", "," ");
	}
}
