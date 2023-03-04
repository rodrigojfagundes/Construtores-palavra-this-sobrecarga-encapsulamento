//sobrecarga de construtor
package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product() {	
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;		
	}
	//criando o construtor sobrecarregado... Pq estamos basicamente chamando o construtor 2 vezes
	//para passar os mesmos parametros, so q sem o quantity
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
