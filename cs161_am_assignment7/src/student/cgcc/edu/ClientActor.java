package student.cgcc.edu;


public class ClientActor extends Main {

	String firstName;
	String lastName;
	String Street;
	String city;
	String State;
	String country;
	double zipCode;
	String phoneNumber;
	String Email;
	String insuranceCarrier;
	
	
	
	public String AvailservicesWork(){
		return l.getList();
	}
	
	public String FillOutSurvey() {
		return "List of questions";
	}
	
}
