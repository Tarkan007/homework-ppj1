package pl.edu.pw.ii.jee.ppj.tarkowski;

public abstract class LaundryParameters {
	
	/**
	* definicja numeru programu
	*/
	protected int number;

	public int getNumber() {
		return number;
	};

	protected abstract void setNumber(int number);
	
	/**
	* definicja temperatury programu
	*/
	
	protected int temp;

	public int getTemp() {
		return temp;
	};

	protected abstract void setTemp(int temp);
	
	
	/**
	* definicja obrotów programu
	*/
	
	protected int rpm;

	public int getRpm() {
		return rpm;
	};

	protected abstract void setRpm(int rpm);
	
	/**
	* definicja czasu programu
	*/
	
	protected int duration;

	public int getDuration() {
		return duration;
	};

	protected abstract void setDuration(int duration);
	
	
}
