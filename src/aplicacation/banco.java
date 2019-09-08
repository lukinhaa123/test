package aplicacation;

import java.util.Scanner;

import ent.conta;

public class banco {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		conta cont;
		
		System.out.println("Entre com numero da conta: ");
		int number = sc.nextInt();
		System.out.println("Entre com o nome: ");
		sc.hasNextLine();
		String name = sc.nextLine();
		System.out.println("Deseja fazer um deposito inicial? y or n");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.println("Digite o valor a ser depositado: ");
		    double initialDeposit = sc.nextDouble();
		    cont = new conta(number, name, initialDeposit);
		}
		else {
			cont = new conta(number, name);
			
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(cont);
		
		sc.close();
	}
	
	

}
