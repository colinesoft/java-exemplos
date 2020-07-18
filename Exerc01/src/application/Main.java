package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		int qtde;
		
		do {
			System.out.print("Quantos funcion�rios ser�o registrados: ");
			qtde = sc.nextInt();
		} while(qtde<=0);
		
		//Cria uma lista de funcion�rios
		List<Employee> funcionarios = new ArrayList<>();
		
		//Alimenta a lista
		for(int i=0; i<qtde; i++) {
			System.out.println("\nFuncion�rio #" + (i+1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			
			//Cria um Item para adiciona � lista
			Employee func = new Employee(id, nome, salario);
			funcionarios.add(func);
		}
		
		//obtem o funcion�rio que ter� aumento
		System.out.print("\nQual funcion�rio ter� aumento (ID): ");
		int id = sc.nextInt();
		
		//testa se o funcion�rio existe
		Employee existe = funcionarios.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		if(existe==null) {
			System.out.println("Funcion�rio inv�lido!");
		} else {
			//OBTEM A PORCENTAGEM DE AUMENTO
			System.out.print("Informe a porcentagem de aumento: ");
			double porcentagem = sc.nextDouble();
			existe.ajustaSalario(porcentagem);
		}
		
		
		//Mostra os funcion�rios
		for(Employee f : funcionarios) {
			System.out.println(f.toString());
		}
	}

}
