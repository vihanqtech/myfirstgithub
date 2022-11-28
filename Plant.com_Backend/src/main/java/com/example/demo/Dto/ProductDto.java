package com.example.demo.Dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String image_thumbnail;

	private String product_description;

	private String product_name;

	private String care;

	private String light;

	private Integer product_price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage_thumbnail() {
		return image_thumbnail;
	}

	public void setImage_thumbnail(String image_thumbnail) {
		this.image_thumbnail = image_thumbnail;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCare() {
		return care;
	}

	public void setCare(String care) {
		this.care = care;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}

	public ProductDto() {

	}

}
