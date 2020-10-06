import java.util.Arrays;

import java.util.Scanner;
/**
 * 
 * @author Richard Colorusso
 *
 */
public class Calculator {

	public static void main(String[] args) {
		double a=0.00;
		//These lines take the user input, and start the formatting for the output
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the starting interval: ");
		double start = input.nextDouble();
		System.out.printf("%n");
		System.out.printf("Enter the ending interval: ");
		double end = input.nextDouble();
		System.out.printf("%n");
		//This sets up deltaX
		double deltX = ((end * 1.0) - start)/1000;
		//Formatting for output code
		System.out.printf("x	f(x)	f'(x)%n");
		
		//This is my equation
		//.5x^2+9x

		//These construct the 3 arrays for x, f(x), and f'(x)
		double[] xlist = new double [1002];
		double[] fofx = new double [1002];
		double[] xPrime = new double [1002];
		
		//This loop runs through the length of the arrays to input the proper values to them
		int i = 0;
		for(a = start; a<end; a+=deltX) {
			xlist[i]=a;
			double fx = fx(a);
				fofx[i]=fx;
			double fpx = (((fofx[i+1])-(fofx[i]))/((xlist[i+1])-(xlist[i])));
				xPrime[i]=fpx;
			i++;
			System.out.printf("%.2f	%.2f	%.2f%n", a, fx, fpx);
		}

	//This method computes f(x)
	}
	public static double fx(double xinput) {
		//return xinput;
		return (.5*(Math.pow(xinput, 2))+(9*xinput));
	}
}

