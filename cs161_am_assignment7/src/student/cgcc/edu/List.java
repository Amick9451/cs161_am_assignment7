//HEADER
//Program Name: Assignment7
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/23/2021
//Description: List class framework

//PSUEDOCODE
//imported array list and utility list
//array list contains available services
//prints out available services
package student.cgcc.edu;

import java.util.ArrayList;
import java.util.List;

private class List extends ClientActor {
	List<String> cList = new ArrayList<String>();
	cList.add("General Surgery");
	cList.add("Diagnostics");
	cList.add("Check up");
}
	for(int i = 0; i < cList.size(); i++) {
		if(cList.get(i) != null) {
			System.out.print(cList.get(i));
			
		}
	}
}
}
		
	
	

