package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		//Define um Scanner para ler do teclado
		Scanner sc = new Scanner(System.in);
		//Criar um formato para utilização da Data
		SimpleDateFormat dateFormatBR = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateTimeFormatBR = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibe as opções
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = dateFormatBR.parse(sc.next());
		//reseta NextLine
		sc.nextLine();
		
		//nesse ponto posso guardar o cliente
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");

		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		
		//nesse ponto já pode guardar os dados da Ordem
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		
		
		//Inicia o loopingo para guardar os items da Ordem
		for(int i=0;i<quantity; i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			//reseta o nextLine
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, product);
			order.addItem(orderItem);
		}
		
		//Exemplo de utilização de String Builder
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nORDER SUMARY");
		sb.append("\nOrder moment: ");
		sb.append(dateTimeFormatBR.format(order.getMoment()));
		sb.append("\nOrder status: ");
		sb.append(order.getStatus());
		sb.append("\nClient: ");
		sb.append(order.getClient().getName() + " (");
		sb.append(dateFormatBR.format(order.getClient().getBirthDate()) + ") - ");
		sb.append(order.getClient().getEmail());
		sb.append("\nOrder items: ");
		
		//CARREGA OS ITENS DA ORDER
		for(OrderItem oi: order.getItems()) {
			sb.append("\n" + oi.toString());
		}
		
		//CARREGA O TOTAL PRICE
		sb.append("\nTotal price: $" + String.format("%.2f", order.total()));
		
		//Neste ponto é que exibe o StringBuilder
		System.out.println(sb.toString());
		
		//Fecha o Scanner para liberar recursos
		sc.close();
	}

}
