package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.ProductDto;
import com.example.demo.Dto.ProductlisstDto;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.Product_image;
import com.example.demo.Entity.Product_type;
import com.example.demo.Entity.Type;
import com.example.demo.Repository.Image_Repo;
import com.example.demo.Repository.Product_Repo;
import com.example.demo.Repository.Type_repo;
import com.example.demo.Repository.product_typeRepo;

@Service
public class Product_service {

	@Autowired
	Product_Repo product_Repo;

	@Autowired
	Image_Repo product_image;

	@Autowired
	Type_repo type_repo;

	@Autowired
	product_typeRepo product_typeRepo;

	public void addplant(Product product) {
		product_Repo.save(product);
	}

	public List<Product> getAllProduct() {
		return product_Repo.findAll();
	}

	public ProductlisstDto productEntityToListDto(Product product) {

		ProductlisstDto productDto = new ProductlisstDto();
		productDto.setId(product.getId());
		// productDto.setimage_thumbnail(product.getImage_thumbnail()
		productDto.setPrice(product.getProduct_price());
		productDto.setPlantName(product.getProduct_name());

		return productDto;
	}

	public ProductDto productEntityToDto(Product product) {

		ProductDto productDto = new ProductDto();
		productDto.setId(product.getId());
		productDto.setProduct_description(product.getProduct_description());
		productDto.setProduct_price(product.getProduct_price());
		productDto.setProduct_name(product.getProduct_name());
		productDto.setImage_thumbnail(product.getImage_thumbnail());
		productDto.setProduct_price(product.getProduct_price());
		return productDto;
	}

	public Product productDtoToEntity(ProductDto productDto) {

		Product product = new Product();
		product.setId(productDto.getId());
		product.setProduct_description(productDto.getProduct_description());
		product.setImage_thumbnail(productDto.getImage_thumbnail());
		product.setCare(productDto.getCare());
		product.setProduct_price(productDto.getProduct_price());
		return product;
	}

	public Product getproduct(int id) {
		return product_Repo.findById(id);
	}

	public void addimage(Product_image image) {
		product_image.save(image);

	}

	public void addtype(Type type) {
		type_repo.save(type);

	}

	public void addproduct_type(Product_type product_type) {
		product_typeRepo.save(product_type);

	}

}
