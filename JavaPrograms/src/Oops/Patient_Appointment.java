package Oops;


class Patient{
	private int patientId;
	private String patientName;
	private String address;
	public Patient(int patientId, String patientName, String address) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
		
	
	
	
	
}


class Appointment {
	private int appointmentId;
	private String appointmentDate;
	private String appointmentTime;
	private int patientId;
	public Appointment(int appointmentId, String appointmentDate, String appointmentTime, int patientId) {
		
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.patientId = patientId;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	
	public  static void  printAppointmentsOfPatient(int patientId,Appointment[] appointments ) {
		for(int i=0; i<appointments.length;i++) {
			if(appointments[i].getPatientId() == patientId) {
				System.out.println("appointment id:"+appointments[i].getAppointmentId());
				System.out.println("appointment Date:"+appointments[i].getAppointmentDate());
				System.out.println("appointment time"+appointments[i].getAppointmentTime());
				System.out.println("=========================================================");
			}
		}
		
	}
}



public class Patient_Appointment {
public static void main(String[] args) {
	
	
	Patient patient1 = new Patient(101,"A","Hyd");
	Patient patient2 = new Patient(102,"B","Delhi");

	Appointment appointment1 = new Appointment (45896,"16/02/2023","3pm",102) ;
	Appointment appointment2 = new Appointment (25634,"23/02/2023","25pm",102) ;
	Appointment appointment3 = new Appointment (45563,"18/03/2023","4pm",101) ;
	Appointment appointment4 = new Appointment (35264,"02/12/2023","1pm",103) ;
	Appointment appointment5 = new Appointment (53264,"10/01/2023","7pm",102) ;

	Appointment[] appointments = {appointment1,appointment2,appointment3,appointment4,appointment5};
	
	Appointment.printAppointmentsOfPatient(102	,appointments);
}
}
