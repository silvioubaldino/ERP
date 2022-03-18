package com.erp.product.exception;

public class ProductException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductException() {
		super("Produto não encontrado.");
	}
}
