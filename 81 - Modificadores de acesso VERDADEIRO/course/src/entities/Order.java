package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product product;
	
	//criando um construtor... construtor é um metodo q passa os valores enviados para ele(o construtor)
	//para os atributos da classe principal... nesse caso para classe Order
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}


	//criando os get e sets para podermos acessar os valores a partir de outra classe
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
}
