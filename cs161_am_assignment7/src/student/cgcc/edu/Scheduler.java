package student.cgcc.edu;

public class Scheduler {
	
	String services;
	String survey;
	String serviceNeed;
	String appointment;
	String referral;
	

	public String RequestToBeSeen() {
		return "A request to be seen has been created";
	}
	
	public String MakeAppointment() {
		return "An appointment has been created";
	}
	
	public String MakeReferral() {
		return "Referral created";
	}
	
	
}
