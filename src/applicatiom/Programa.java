package applicatiom;

import java.util.Scanner;
import entitie.Product;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do Produto:");
		System.out.println("NOME: ");
		String name = sc.nextLine();
		System.out.println("PRECO: ");
		double price = sc.nextDouble();
		//System.out.println("Quantidade no estoque: ");
		//int quantity = sc.nextInt();
		
		Product produto = new Product( name, price);
		produto.setName("computador");
		System.out.println("Dados: " + produto.getName());
		produto.setPrice(1200);
		System.out.println("preço" + produto.getPrice());
		
		System.out.println("Product Data: " +  produto.toString());
		System.out.println("Entre com numero de produtos pra ser add ao estoque: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println("Product Updated: " +  produto.toString());
		
		System.out.println("Entre com numero de produtos pra ser retirado ao estoque: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println("Product Updated: " +  produto.toString());
		
		
		
		
		
		
		
		
		sc.close();
	}

}
