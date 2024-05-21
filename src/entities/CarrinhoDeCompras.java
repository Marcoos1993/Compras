package entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> list = new ArrayList<>();
	
	public void adicionarItem(String name, double price, int quantity) {
		list.add(new Item(name, price, quantity)); 
		
	}

	public void removerItem(String name) {
		List <Item> listDelete = new ArrayList<>();
		for (Item i : list) {
			if (i.getName().equalsIgnoreCase(name)) {
				listDelete.add(i);
			}
			list.removeAll(listDelete);
		}
	}
	
	public double calcularValorTotal() {
		double sum = 0;
		
		for (Item i : list) {
			if(i.getQuantity() > 1) {
			double calc = i.getPrice() * i.getQuantity();
			sum += calc;
		}
			else sum += i.getPrice();
	}
		return sum;
	}
	
	public void exibirItems() {
		System.out.println(list);
		 
	}
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Celular", 1000, 2);
		carrinho.adicionarItem("tv", 2000, 1);
		carrinho.adicionarItem("som", 500, 1);
		
		carrinho.exibirItems();

		carrinho.removerItem("Celular");

		carrinho.exibirItems();
		
		System.out.println(" O valor total das compras e de: " + carrinho.calcularValorTotal());
		
		
		
		
		
	}
}