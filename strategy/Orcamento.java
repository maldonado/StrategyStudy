package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chainofresponsability.Item;

public class Orcamento {
	
	private double valor;
	private List<Item> itens;
	
	public Orcamento(double valor){
		this.valor = valor;
		this.itens = new  ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public boolean estaNaLista(List<Item> itensPesquisados){
		return this.itens.containsAll(itensPesquisados);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}
	
	public boolean removeItem(Item item){
		return itens.remove(item);
	}
}