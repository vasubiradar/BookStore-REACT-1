package com.BOOTJPA.BOOTJPA.mainfolder;


import jakarta.persistence.*;
@Entity
public class Product {
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private Integer id;
    private String name;
    private float price;
 
    public Product() {
    }
 
    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
}