package Enum01;

public class Enum002 {

	public static void main(String[] args) {

		System.out.println(TraficLight.RED);
		
		TraficLight a= TraficLight.RED;
		System.out.println(a.Action());
	}

}
enum TraficLight{
	RED("Stop"),
	ORANGE("Slow"),
	GREEN("Go");
	
	private String action;
	
	private TraficLight (String action){
		this.action=action;
	}
	
	public String Action() {
		return this.action;
	}
	
	
	
}