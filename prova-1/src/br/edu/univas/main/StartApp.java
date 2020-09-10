package br.edu.univas.main;

import br.edu.univas.vo.Cheese;
import br.edu.univas.vo.JuncaoIngrediente;
import br.edu.univas.vo.MassaPizza;
import br.edu.univas.vo.Onions;
import br.edu.univas.vo.Tomatoes;

public class StartApp {

	public static void main(String[] args) {
		MassaPizza pizza = new MassaPizza();
		Tomatoes tomatoes = new Tomatoes();
		Cheese cheese = new Cheese();
		Onions onions = new Onions();
		
		/*
		String description = pizza.description() + " " +
				tomatoes.description() + " " +
				cheese.description() + " " +
				onions.description();
		
		
		
		double price = pizza.price() + 
				tomatoes.price() +
				//SomarProdutos.price(2) +
				onions.price();*/
		
		JuncaoIngrediente juncaoIngrediente = new JuncaoIngrediente();
		juncaoIngrediente.addComponent(pizza);
		juncaoIngrediente.addComponent(tomatoes);
		juncaoIngrediente.addComponent(cheese);
		juncaoIngrediente.addComponent(onions);
		
		
		
		System.out.println("Pedido: " + juncaoIngrediente.description());
		System.out.println("Preço total: R$ " + juncaoIngrediente.price());
	}
}
