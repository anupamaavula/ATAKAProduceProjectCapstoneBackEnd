package com.tts.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	@NotNull(message = "Product name is required.")
	private String name;

	@Column(name = "price")
	@NotNull(message = "Product price is required.")
	private Double price;

	@Column(name = "quantity")
	@NotNull(message = "Product quantity is required.")
	private int quantity;

	@Column(name = "picture url")
	@NotNull(message = "Product pictureUrl is required.")
	private String pictureUrl;

	public Product() {
	}

	public Product(@NotNull(message = "Product name is required") String name,
			@NotNull(message = "Product price is required.") Double price,
			@NotNull(message = "Product quantity is required.") int quantity,
			@NotNull(message = "Product pictureUrl is required.") String pictureUrl) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.pictureUrl = pictureUrl;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}