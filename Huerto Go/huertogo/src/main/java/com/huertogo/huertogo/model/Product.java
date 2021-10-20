package com.huertogo.huertogo.model;

public class Product {
	private String sku;
	private String nombre;
	private String proveedor;
	private int unidad;
	private String categoria;
	private String subcategoria;
	private double precioDeVenta;
	private String grupoDeAlimentos;
	private String subgrupoDeAlimentos;
	
	public Product() {
		super();
	}

	/**
	 * @param sku
	 * @param nombre
	 * @param proveedor
	 * @param unidad
	 * @param categoria
	 * @param subcategoria
	 * @param precioDeVenta
	 * @param grupoDeAlimentos
	 * @param subgrupoDeAlimentos
	 */
	public Product(String sku, String nombre, String proveedor, int unidad, String categoria, String subcategoria,
			double precioDeVenta, String grupoDeAlimentos, String subgrupoDeAlimentos) {
		super();
		this.sku = sku;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.unidad = unidad;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.precioDeVenta = precioDeVenta;
		this.grupoDeAlimentos = grupoDeAlimentos;
		this.subgrupoDeAlimentos = subgrupoDeAlimentos;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public double getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}

	public String getGrupoDeAlimentos() {
		return grupoDeAlimentos;
	}

	public void setGrupoDeAlimentos(String grupoDeAlimentos) {
		this.grupoDeAlimentos = grupoDeAlimentos;
	}

	public String getSubgrupoDeAlimentos() {
		return subgrupoDeAlimentos;
	}

	public void setSubgrupoDeAlimentos(String subgrupoDeAlimentos) {
		this.subgrupoDeAlimentos = subgrupoDeAlimentos;
	}	
}
