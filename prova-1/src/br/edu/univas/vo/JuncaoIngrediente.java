package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class JuncaoIngrediente implements SomarProdutos {

private List<SomarProdutos> somarProdutosf;
	
	public JuncaoIngrediente() {
		somarProdutosf = new ArrayList<SomarProdutos>();
	}
	
	
	public String description() {
		String pizzaDescription = "";
		
		for (SomarProdutos soma : somarProdutosf) {
			pizzaDescription += soma.description() + ' ';
		}
		
		return pizzaDescription;
	}
	
	
	public double price() {
		double totalPrice = 0;
		
		for (SomarProdutos soma : somarProdutosf) {
			totalPrice += soma.price();
		}
		
		return totalPrice;
	}
	
	public void addComponent(SomarProdutos somarProdutos) {
		somarProdutosf.add(somarProdutos);
	}
	
	public void removeComponent(SomarProdutos somarProdutos) {
		somarProdutosf.remove(somarProdutos);
	}
}
