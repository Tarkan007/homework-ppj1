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
 * Program number setter
 */
	
	public void setNumber(int number) {
	this.number = number;
	}

	/*
	 * Laundry temperature setter
	 */
	
	public void setTemp(int temp) {
		this.temp = temp;
	}

	/*
	 * Laundry duration setter
	 */
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/*
	 * Laundry rotation per minute setter
	 */
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	/*
	 * method putting actual values, dependent on setNumber method passing laundry program number 
	 */
	
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
		
		/*
		 * Wrong number communicate
		 */
		
		else  {
		System.out.println("Wybra³eœ niew³aœciwy numer");
		}
	}
}
