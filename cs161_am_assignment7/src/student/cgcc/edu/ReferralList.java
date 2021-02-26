//HEADER
//Program Name: Assignment7
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/23/2021
//Description: ReferralList class framework

//PSEUDOCODE 
//ReferralList attributes created
//matchService Needs method checks for service need matching
//displayMatchedList method returns hospital where need will be met

package student.cgcc.edu;

public class ReferralList {

	
	private String providerName;
	private String location;
	private String phone;
	private String serviceProvided;
	
	
	public String matchServiceNeeds() {
		return "Service Need Matched!";
	}
	
	public String displayMatchedList() {
		return "List of matched Service Needs";
	}
}
