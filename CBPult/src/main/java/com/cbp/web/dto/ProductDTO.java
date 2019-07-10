package com.cbp.web.dto;

public class ProductDTO {
	
	
    private Long codigoUsuarioModifica;
    private Long idProduct;
    private Long productActive;
    private String productLogo;
    private String productName;
    
    
	public Long getCodigoUsuarioModifica() {
		return codigoUsuarioModifica;
	}
	public void setCodigoUsuarioModifica(Long codigoUsuarioModifica) {
		this.codigoUsuarioModifica = codigoUsuarioModifica;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Long getProductActive() {
		return productActive;
	}
	public void setProductActive(Long productActive) {
		this.productActive = productActive;
	}
	public String getProductLogo() {
		return productLogo;
	}
	public void setProductLogo(String productLogo) {
		this.productLogo = productLogo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
