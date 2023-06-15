package Enum01;

public class Enum001 {

	public static void main(String[] args) {

		Scadule s= new Scadule(Days.SUN);
		System.out.println(Days.SUN);
		s.weekMgmt();
	}
	}

enum Days{
	SUN,MON,TUE,WED,THU,FRI,SAT
}

class Scadule{
	Days day;
	public Scadule(Days d) {
		this.day=d;
	}
	
	public void weekMgmt(){
		switch(day) {
		case SUN:
			System.out.println("weekend");
			break;
		default:
			break;
		}
	}
	
	
	
}






