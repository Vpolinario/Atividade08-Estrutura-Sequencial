package Atts_Montanha;

import java.util.Scanner;

public class att8 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		double varHora, qntHora, salario;
		
		System.out.println("Informe quanto voce ganha por hora: ");
		varHora = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		qntHora = scanner.nextDouble();
		
		salario = varHora * qntHora;
		
		System.out.println("Seu salario é: " + salario);
		 
		
		
		
		
	}

}
