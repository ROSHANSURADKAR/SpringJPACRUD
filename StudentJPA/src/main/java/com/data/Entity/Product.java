package com.data.Entity;



	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="product_tb1")
	public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="prod_id")
		int id;
		
		@Column(name="prod_name")
		String pname;
		@Column(name="prod_category")
		String category;
		@Column(name="prod_price")
		double price;
		int qty;
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(int id, String pname, String category, double price, int qty) {
			super();
			this.id = id;
			this.pname = pname;
			this.category = category;
			this.price = price;
			this.qty = qty;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
}
