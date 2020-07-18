package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//Cria uma List<String>
		List<String> list = new ArrayList<>();
		
		//Adicionando itens na Lista
		list.add("Lucas");
		list.add("Raissa");
		list.add("Rebeca");
		list.add("Maria Eduarda");
		list.add("Ana Beatriz");
		list.add("Camila");
		
		//Mostra os itens da Lista
		System.out.println("\nNormal : ------------------------");
		for(String item : list) {
			System.out.println(item);
		}

		//Adiciona um item na posicao 2
		list.add(2, "Item Adicionado na Posi��o 2");		
		//Mostra os itens da Lista
		System.out.println("\nItem adicionado : ------------------------");
		for(String item : list) {
			System.out.println(item);
		}
		
		//Remove o item da posicao 2
		list.remove(2);
		//Lista ap�s remover o item 2
		System.out.println("\nItem removido : ------------------------");
		for(String item : list) {
			System.out.println(item);
		}
		
		
		//Remove item de acordo com predicados
		list.removeIf( x-> x.contains("Lucas"));
		//Lista ap�s remover o item 2
		System.out.println("\nRemo��o por predicado 1: ------------------------");
		for(String item : list) {
			System.out.println(item);
		}
		
		//Mostra a posi��o da Ana Beatriz
		System.out.println("\nPosi��o de Ana Beatriz: " + list.indexOf("Ana Beatriz"));
		
		//Aplica Filtro na List
		System.out.println("\nFiltra que come�a com R: ------------------------");
		List<String> result = list.stream().filter(x-> x.charAt(0)=='R').collect(Collectors.toList());
		for(String l : result) {
			System.out.println(l);
		}
		
		//Procurando o primeiro elemento que come�a com 'R'
		System.out.println("\nPrimeiro que come�a com R: ------------------------");
		String nome = list.stream().filter(x-> x.charAt(0) == 'R').findFirst().orElse(null);
		System.out.println(nome);

	}

}
