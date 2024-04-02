package edu.br.uft.poo2024;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	public static void main(String[] args) {
		
		int Numero; 
		String Agencia; 
		String NomeCliente; 
		double Saldo; 
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite seu nome.");
		NomeCliente = scanner.nextLine(); 
		
		System.out.println("Digite sua agência.");
		Agencia = scanner.nextLine();
		
		System.out.println("Digite o numero da conta.");
		Numero = scanner.nextInt(); 
		
		System.out.println("Digite seu saldo.");
		Saldo = scanner.nextDouble(); 
		
		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já esta disponivel para saque");
		
		
	}
}
