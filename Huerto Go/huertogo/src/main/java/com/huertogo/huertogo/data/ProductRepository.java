package com.huertogo.huertogo.data;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository /*extends JpaRepository<ProductBean, String>*/ {
	
	//public List<ProductBean> findAll();
	
	//public List<ProductBean> findAllByCategoria(String categoria);
	
	 /*@Query(value = "SELECT * FROM PRODUCTOS "
	 		+ " ?1 WHERE "
	 		+ " ?2 PROVEEDOR = ?3 "
	 		+ " ?4 CATEGORIA = ?5 "
	 		+ " ?6 SUBCATEGORIA = ?7 "
	 		+ " ?8 PRECIO_DE_VENTA BETWEEN = ?9 AND ?10"
	 		+ " ?11 GRUPO_DE_ALIMENTOS = ?12 "
	 		+ " ?13 SUBGRUPO_DE_ALIMENTOS = ?14")
	public List<ProductBean> findProducts(String grupoDeAlimentos);*/
}
