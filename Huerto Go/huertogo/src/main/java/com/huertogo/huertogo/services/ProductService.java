package com.huertogo.huertogo.services;

import org.springframework.stereotype.Service;

import com.huertogo.huertogo.model.Product;
import com.huertogo.huertogo.model.ProductFiltersInput;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class ProductService {
	private static final Logger logger = LogManager.getLogger(ProductService.class);
	
	/*@Autowired
	ProductRepository productRepository;*/

	public List<Product> getProductsService(ProductFiltersInput input) {
        logger.info("[GET] Entering to getProductsService()");
		
        /*List<ProductBean> products = productRepository.findProducts(
         * input.getProveedor.isEmpty() ? "--" : "",
         * input.getProveedor.isEmpty() ? "" : input.getProveedor()
         * );*/
        
        List<Product> products = new ArrayList<Product>();
        
        Product product = new Product();
			product.setSku("AE0001");
			product.setProveedor("Empacadora de carnes selectas de Arenal SA de CV");
			product.setNombre("Jamon americano espaldilla cocida (250 g)");
			product.setUnidad(30);
			product.setCategoria("Enbutidos");
			product.setSubcategoria("Jamón");
			product.setPrecioDeVenta(32.50);
			product.setGrupoDeAlimentos("Alimentos de Origen Animal");
			product.setSubgrupoDeAlimentos("Alto aporte en grasa");
			
		Product product1 = new Product();
			product1.setSku("AE0002");
			product1.setProveedor("Empacadora de carnes selectas de Arenal SA de CV");			
			product1.setNombre("Extrafino jamon de pierna (250 g)");
			product1.setUnidad(27);
			product1.setCategoria("Embutido");
			product1.setSubcategoria("Jamón");
			product1.setPrecioDeVenta(48.00);
			product1.setGrupoDeAlimentos("Alimentos de Origen Animal");
			product1.setSubgrupoDeAlimentos("Alto aporte en grasa");
			
			/*Product product2 = new Product();
			product2.setSku("FV001");
			product2.setProveedor("Guzva");
			product2.setNombre("Naranja");
			product2.setUnidad(30);
			product2.setCategoria("Frutas y verduras granel");
			product2.setSubcategoria("Frutas");
			product2.setPrecioDeVenta(24.00);
			product2.setGrupoDeAlimentos("Frutas");
			product2.setSubgrupoDeAlimentos("Sin grasa");*/
		
		Product product3 = new Product();
			product3.setSku("OP007");
			product3.setProveedor("Itakua");
			product3.setNombre("Mermelada Xoconostle con chile (270 g)");
			product3.setUnidad(10);
			product3.setCategoria("Despensa");
			product3.setSubcategoria("Untables");
			product3.setPrecioDeVenta(27.50);
			product3.setGrupoDeAlimentos("Azucares");
			product3.setSubgrupoDeAlimentos("Sin grasa");

		products.add(product3);
		products.add(product);
		//products.add(product2);
		products.add(product1);

        logger.info("[GET] Exiting from getProductsService()");
		return products;
	}

	public ProductFiltersInput getInput() {
		ProductFiltersInput input = new ProductFiltersInput();
		
		List<String> categoria = new ArrayList<String>();
		categoria.add("Frutas y verduras granel");
		input.setCategoria(categoria);
		
		return input;
	}

}
