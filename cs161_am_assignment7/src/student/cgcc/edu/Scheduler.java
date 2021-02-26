//HEADER
//Program Name: Assignment7
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/23/2021
//Description: Scheduler class framework

//PSEUDOCODE
//attributes outlined
//RequestToBeSeen method returns a request to be seen has been created
//MakeAppointment method returns an appointment has been created
//MakeReferral Method returns Referral created

package student.cgcc.edu;

public class Scheduler {
	private List availServices;
	private String survey;
	private String serviceNeed;
	private String appointment;
	private String referral;
	
	availServices = ClinicService.ServiceCode;
			
	public String RequestToBeSeen(MedicalEngagement) {
		return "A request to be seen has been created";
	}
	
	public String MakeAppointment() {
		return "An appointment has been created";
	}
	
	public String MakeReferral() {
		return "Referral created";
	}
	
	
}
