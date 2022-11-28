package com.example.demo.Dto;

public class ProductlisstDto {
//
	private Integer id;
	private Integer image_id;
	private Integer price;
	private String plantName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public ProductlisstDto(Integer id, Integer image_id, Integer price, String plantName) {
		super();
		this.id = id;
		this.image_id = image_id;
		this.price = price;
		this.plantName = plantName;
	}

	public Integer getImage_id() {
		return image_id;
	}

	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}

	public ProductlisstDto() {

	}

}
