package br.com.grupoicts.entities;

public class Product {
	public String name; //Using Wrapper
	public Double price;//Using Wrapper
	public Integer quantity;//Using Wrapper
    //source > Generate Constructor using Field
	public Product(String name, double price) {
		//super();  << Nao necessario agora
		this.name = name;
		this.price = price;
	}
    //source > Generate Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
