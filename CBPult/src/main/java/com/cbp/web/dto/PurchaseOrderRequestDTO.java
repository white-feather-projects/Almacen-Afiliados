package com.cbp.web.dto;



public class PurchaseOrderRequestDTO {
	private long idRequest;
	private String fechaModificacion;
	private String cantidad;
	
	private String descriptionOrder;
	private long quantity; 
	private String codeUserLouder;
	private String codeUserAproved; 
	private String statusOrder;
	private String fechaCarga; 
	private ProductDTO productDTO;
	private Long idProduct;
	
	
	private String purchaseOrderAprovedDate;
	private String numberOrder;
	private Long idOrderRequest;
	private String orderCommetns;
	private String idProvider;
	private String orderType;
	private String maximo;
	private String minimo;
	 
	public String getDescriptionOrder() {
		return descriptionOrder;
	}
	public void setDescriptionOrder(String descriptionOrder) {
		this.descriptionOrder = descriptionOrder;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getCodeUserLouder() {
		return codeUserLouder;
	}
	public void setCodeUserLouder(String codeUserLouder) {
		this.codeUserLouder = codeUserLouder;
	}
	public String getCodeUserAproved() {
		return codeUserAproved;
	}
	public void setCodeUserAproved(String codeUserAproved) {
		this.codeUserAproved = codeUserAproved;
	}
	public String getFechaCarga() {
		return fechaCarga;
	}
	public void setFechaCarga(String fechaCarga) {
		this.fechaCarga = fechaCarga;
	}
	
	public String getStatusOrder() {
		return statusOrder;
	}
	public void setStatusOrder(String statusOrder) {
		this.statusOrder = statusOrder;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
		
		
	}
	public String getNumberOrder() {
		return numberOrder;
	}
	public void setNumberOrder(String numberOrder) {
		this.numberOrder = numberOrder;
	}
	public Long getIdOrderRequest() {
		return idOrderRequest;
	}
	public void setIdOrderRequest(Long idOrderRequest) {
		this.idOrderRequest = idOrderRequest;
	}
	public String getOrderCommetns() {
		return orderCommetns;
	}
	public void setOrderCommetns(String orderCommetns) {
		this.orderCommetns = orderCommetns;
	}
	public String getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(String idProvider) {
		this.idProvider = idProvider;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getPurchaseOrderAprovedDate() {
		return purchaseOrderAprovedDate;
	}
	public void setPurchaseOrderAprovedDate(String purchaseOrderAprovedDate) {
		this.purchaseOrderAprovedDate = purchaseOrderAprovedDate;
	}
	
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public long getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(long idRequest) {
		this.idRequest = idRequest;
		
		
	}
	public String getMaximo() {
		return maximo;
	}
	public void setMaximo(String maximo) {
		this.maximo = maximo;
	}
	public String getMinimo() {
		return minimo;
	}
	public void setMinimo(String minimo) {
		this.minimo = minimo;
	}
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	
	
	@Override
	public String toString() {
		return "PurchaseOrderRequestDTO [idRequest=" + idRequest + ", fechaModificacion=" + fechaModificacion
				+ ", cantidad=" + cantidad + ", descriptionOrder=" + descriptionOrder + ", quantity=" + quantity
				+ ", codeUserLouder=" + codeUserLouder + ", codeUserAproved=" + codeUserAproved + ", statusOrder="
				+ statusOrder + ", fechaCarga=" + fechaCarga + ", productDTO=" + productDTO + ", idProduct=" + idProduct
				+ ", purchaseOrderAprovedDate=" + purchaseOrderAprovedDate + ", numberOrder=" + numberOrder
				+ ", idOrderRequest=" + idOrderRequest + ", orderCommetns=" + orderCommetns + ", idProvider="
				+ idProvider + ", orderType=" + orderType + ", maximo=" + maximo + ", minimo=" + minimo + "]";
	}
	
}
