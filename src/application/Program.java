package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		triangle x,y;
		x = new triangle();
		y = new triangle();
		
		Locale.setDefault(Locale.US);
		System.out.println("entre com as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("entre com as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A Area do Triangulo X e: %.4f%n",areaX);
		System.out.printf("A Area do Triangulo Y e: %.4f%n",areaY);
		
		
	    if (areaX > areaY) {
	    	System.out.println("maior area é de X");
	    }
	    else {
	    	System.out.println("maior area é de Y");
	    }
		
		sc.close();
	}
}
