package pl.edu.pw.ii.jee.ppj.tarkowski;

import java.util.Scanner;

public class StartLaundryApp {

	/*
	 * In main method the user chooses the laundry program
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Proszê wpisaæ numer:");
		System.out.println("1 - Pranie ubrañ sportowych");
		System.out.println("2 - Pranie ubrañ delikatnych");
		System.out.println("3 - Pranie ubrañ kolorowych");
		
		Scanner scan = new Scanner(System.in);
		int programik;
		programik = scan.nextInt();

		/*
		 * Instantiating
		 */
		
		Laundry pranie = new Laundry(programik);
		pranie.setNumber(programik);
		
		/*
		 * Final result, implementing interface, abstract class and inherited methods
		 */
		
		System.out.println("Temperatura prania to: " + pranie.getTemp() + ", czas prania to: " + pranie.getDuration() +  ", obroty na minutê: " + pranie.getRpm());
		scan.close();
	}

}
