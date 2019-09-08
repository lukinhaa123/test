package ent;

public class conta {
	
	private int number;
	private String name;
	private double saldo = 0;
	private double deposit;
	private double saque;
	
	public conta(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		depositarValor(initialDeposit);

	}
	
	public conta(int number, String name) {
		this.number = number;
		this.name = name;
	}
	

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public double getSaque() {
		return saque;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositarValor(double amount) {
		
		saldo = saldo + amount;
		
	}
	
	public void sacarValor(double amount) {
		
		saldo = saldo - amount + 5;
		
	}
	
	public String toString() {
		
		return "conta: "
				+number
				+" ,nome: "
				+name
				+"saldo: "
				+String.format("%.2f", saldo);
 	}
	
	
	
	
	
	

}
