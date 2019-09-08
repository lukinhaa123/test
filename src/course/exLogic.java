package course;

import java.util.Scanner;

public class exLogic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int resultado = numero1+numero2;
		
		System.out.printf("A Soma dos dois numeros é %d", resultado);
		
		sc.close();
	}

}
