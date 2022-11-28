package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ProductDto;
import com.example.demo.Dto.ProductlisstDto;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.Product_image;
import com.example.demo.Entity.Product_type;
import com.example.demo.Entity.Type;
import com.example.demo.Service.Product_service;
import com.example.demo.common.ApiResponse;

@RestController
@RequestMapping("product")
public class Product_Controller {

	@Autowired
	Product_service product_service;

	@PostMapping("addproduct")
	public ResponseEntity<ApiResponse> createproduct(@RequestBody Product product) {
		product_service.addplant(product);
		return new ResponseEntity<>(new ApiResponse(true, "Product has been added"), HttpStatus.CREATED);
	}

	@GetMapping("getlist")
	public List<ProductlisstDto> getproductList(ProductlisstDto productlisstDto) {
		List<Product> allProduct = product_service.getAllProduct();
		List<ProductlisstDto> productList = new ArrayList<>();
		allProduct.forEach(a -> {
			productList.add(product_service.productEntityToListDto(a));
		});
		return productList;
	}

	@GetMapping("getproduct")
	public ProductDto getProduct(@RequestParam int id) {
		Product product = product_service.getproduct(id);
		ProductDto product1 = product_service.productEntityToDto(product);

		return product1;
	}

	@PostMapping("addimage")
	public ResponseEntity<ApiResponse> addimage(@RequestBody Product_image image) {
		product_service.addimage(image);
		return new ResponseEntity<>(new ApiResponse(true, "Image has been added"), HttpStatus.CREATED);
	}

	@PostMapping("addtype")
	public ResponseEntity<ApiResponse> addtype(@RequestBody Type type) {
		product_service.addtype(type);
		return new ResponseEntity<>(new ApiResponse(true, "Type has been added"), HttpStatus.OK);
	}

	@PostMapping("addproducttype")
	public ResponseEntity<ApiResponse> addproduct_type(@RequestBody Product_type product_type) {
		product_service.addproduct_type(product_type);
		return new ResponseEntity<>(new ApiResponse(true, "Product_type is add"), HttpStatus.OK);
	}
}
