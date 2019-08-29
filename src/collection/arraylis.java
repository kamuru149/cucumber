package collection;

import java.util.ArrayList;

public class arraylis {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      
	      
	      System.out.println("Size of al after additions: " + al.size());


	}

}
