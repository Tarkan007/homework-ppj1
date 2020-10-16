package pl.edu.pw.ii.jee.ppj.tarkowski;

public class Laundry extends LaundryParameters implements WashingMachine {


/*
 * Constructor
 */
	
	public Laundry(int number) {
		setNumber(number);
		program();
	}
	
/*
 * Podstawiacz numeru programu
 */
	
	public void setNumber(int number) {
	this.number = number;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public void program() {
		if (number==1) {
			setTemp(50);
			setDuration(50);
			setRpm(700);
		} 
		
		else if (number==2) {
			setTemp(30);
			setDuration(70);
			setRpm(300);
		} 
		
		else if (number==3) {
			setTemp(40);
			setDuration(50);
			setRpm(500);
		}
		
		else  {
		System.out.println("Wybra³eœ niew³aœciwy numer");
		}
	}
}
