package com.cbp.web.dto;

public class PurchaseOrderDTO {
	private String orderDescription;
	private String orderCommetns;
	private String orderType;
	private String purchaseOrderDate;
	private String purchaseOrderAprovedDate;
	private String quantity;
	private String orderStatus;
	private String purchaseOrderNumber;
	private Long idOrderRequest;
	private Long idProduct;
	private  String codAprovedUser;
    private String codUserLoader;
    private ProductDTO productDTO;
	
	
	
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public String getOrderCommetns() {
		return orderCommetns;
	}
	public void setOrderCommetns(String orderCommetns) {
		this.orderCommetns = orderCommetns;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getPurchaseOrderDate() {
		return purchaseOrderDate;
	}
	public void setPurchaseOrderDate(String purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}
	public String getPurchaseOrderAprovedDate() {
		return purchaseOrderAprovedDate;
	}
	public void setPurchaseOrderAprovedDate(String purchaseOrderAprovedDate) {
		this.purchaseOrderAprovedDate = purchaseOrderAprovedDate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	////////////////////////////////////
	public Long getIdOrderRequest() {
		return idOrderRequest;
	}
	public void setIdOrderRequest(Long idOrderRequest) {
		this.idOrderRequest = idOrderRequest;
	}
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	
	public String getCodAprovedUser() {
		return codAprovedUser;
	}
	public void setCodAprovedUser(String codAprovedUser) {
		this.codAprovedUser = codAprovedUser;
	}
	public String getCodUserLoader() {
		return codUserLoader;
	}
	public void setCodUserLoader(String codUserLoader) {
		this.codUserLoader = codUserLoader;
	}
	
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	@Override
	public String toString() {
		return "PurchaseOrderDTO [orderDescription=" + orderDescription + ", orderCommetns=" + orderCommetns
				+ ", orderType=" + orderType + ", purchaseOrderDate=" + purchaseOrderDate
				+ ", purchaseOrderAprovedDate=" + purchaseOrderAprovedDate + ", quantity=" + quantity + ", orderStatus="
				+ orderStatus + ", purchaseOrderNumber=" + purchaseOrderNumber + ", idOrderRequest=" + idOrderRequest
				+ ", idProduct=" + idProduct + ", codAprovedUser=" + codAprovedUser + ", codUserLoader=" + codUserLoader
				+ ", productDTO=" + productDTO + "]";
	}

	
}
