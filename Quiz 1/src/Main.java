import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		//Prompts for input of statistics about an NFL player//
		System.out.println("Input Number of Passing Attempts:");
		Scanner keyboard = new Scanner(System.in);
		
		double ATT = keyboard.nextDouble();
		System.out.println("Input Number of Completions:");
		double COMP = keyboard.nextDouble();
		System.out.println("Input Passing Yards:");
		double YDS = keyboard.nextDouble();
		System.out.println("Input Touchdown Passes:");
		double TD = keyboard.nextDouble();
		System.out.println("Input Interceptions:");
		double INT = keyboard.nextDouble();
		
		double A = (((COMP/ATT)-.3)*5);
		double B = (((YDS/ATT)-3)*.25);
		double C = ((TD/ATT)*20);
		double D = (2.375-((INT/ATT)*25));
		
		//Calculates the passer rating according to the NFL formula//
		
		double PR = ((A+B+C+D)/6)*100;
		
		System.out.println("Passer Rating =" + Double.toString(PR));
	}

}
