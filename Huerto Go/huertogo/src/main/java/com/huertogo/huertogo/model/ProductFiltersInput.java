package com.huertogo.huertogo.model;

import java.util.List;

public class ProductFiltersInput {
	private List<String> proveedor;
	private List<String> categoria;
	private List<String> subcategoria;
	private double minPrecio;
	private double maxPrecio;
	private List<String> grupoDeAlimentos;
	private List<String> subgrupoDeAlimentos;
	
	public ProductFiltersInput() {
		super();
	}

	/**
	 * @param proveedor
	 * @param categoria
	 * @param subcategoria
	 * @param minPrecio
	 * @param maxPrecio
	 * @param grupoDeAlimentos
	 * @param subgrupoDeAlimentos
	 */
	public ProductFiltersInput(List<String> proveedor, List<String> categoria, List<String> subcategoria,
			double minPrecio, double maxPrecio, List<String> grupoDeAlimentos, List<String> subgrupoDeAlimentos) {
		super();
		this.proveedor = proveedor;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.minPrecio = minPrecio;
		this.maxPrecio = maxPrecio;
		this.grupoDeAlimentos = grupoDeAlimentos;
		this.subgrupoDeAlimentos = subgrupoDeAlimentos;
	}

	/**
	 * @return the proveedor
	 */
	public List<String> getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(List<String> proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the categoria
	 */
	public List<String> getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(List<String> categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the subcategoria
	 */
	public List<String> getSubcategoria() {
		return subcategoria;
	}

	/**
	 * @param subcategoria the subcategoria to set
	 */
	public void setSubcategoria(List<String> subcategoria) {
		this.subcategoria = subcategoria;
	}

	/**
	 * @return the minPrecio
	 */
	public double getMinPrecio() {
		return minPrecio;
	}

	/**
	 * @param minPrecio the minPrecio to set
	 */
	public void setMinPrecio(double minPrecio) {
		this.minPrecio = minPrecio;
	}

	/**
	 * @return the maxPrecio
	 */
	public double getMaxPrecio() {
		return maxPrecio;
	}

	/**
	 * @param maxPrecio the maxPrecio to set
	 */
	public void setMaxPrecio(double maxPrecio) {
		this.maxPrecio = maxPrecio;
	}

	/**
	 * @return the grupoDeAlimentos
	 */
	public List<String> getGrupoDeAlimentos() {
		return grupoDeAlimentos;
	}

	/**
	 * @param grupoDeAlimentos the grupoDeAlimentos to set
	 */
	public void setGrupoDeAlimentos(List<String> grupoDeAlimentos) {
		this.grupoDeAlimentos = grupoDeAlimentos;
	}

	/**
	 * @return the subgrupoDeAlimentos
	 */
	public List<String> getSubgrupoDeAlimentos() {
		return subgrupoDeAlimentos;
	}

	/**
	 * @param subgrupoDeAlimentos the subgrupoDeAlimentos to set
	 */
	public void setSubgrupoDeAlimentos(List<String> subgrupoDeAlimentos) {
		this.subgrupoDeAlimentos = subgrupoDeAlimentos;
	}
}
