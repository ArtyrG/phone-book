package phone.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Arthur
 * @version 0.9
 */
public class PhoneBook 
{
    public static void main( String[] args )
    {
    	// create ArrayList list, list1 is empty, list2 for save number phone
    	ArrayList<String> list = new ArrayList<String>(); 
    	ArrayList<String> list1 = new ArrayList<String>(); 
    	ArrayList<String> list2 = new ArrayList<String>(); 
    	// create HashMap for save name and ArrayList
    	Map<String, ArrayList> map = new HashMap<String, ArrayList>(); 

    	// add number
    	list.add("98789675 897666578"); 
    	list2.add("892727892 897212323 8923278292"); 
    	// add name, number
    	map.put("Galeev A.S.", list); 
    	map.put("Ivanov I.I.", list1); 
    	map.put("Petrov B.G.", list2); 
    	map.put("Hollp W.V.", list1); 

    }
}
