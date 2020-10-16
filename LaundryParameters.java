package pl.edu.pw.ii.jee.ppj.tarkowski;

public abstract class LaundryParameters {
	
	/**
	* program number definition
	*/
	protected int number;

	public int getNumber() {
		return number;
	};

	protected abstract void setNumber(int number);
	
	/**
	* program temperature definition
	*/
	
	protected int temp;

	public int getTemp() {
		return temp;
	};

	protected abstract void setTemp(int temp);
	
	
	/**
	* program rotation definition
	*/
	
	protected int rpm;

	public int getRpm() {
		return rpm;
	};

	protected abstract void setRpm(int rpm);
	
	/**
	* program duration definition
	*/
	
	protected int duration;

	public int getDuration() {
		return duration;
	};

	protected abstract void setDuration(int duration);
	
	
}
