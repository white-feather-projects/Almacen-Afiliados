package com.cbp.web.dto;

public class OrderSaleDTO {
	
	private String descriptionOrder;
	private Integer quantity;
	public String getDescriptionOrder() {
		return descriptionOrder;
	}
	public void setDescriptionOrder(String descriptionOrder) {
		this.descriptionOrder = descriptionOrder;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public OrderSaleDTO(String descriptionOrder, Integer quantity) {
		super();
		this.descriptionOrder = descriptionOrder;
		this.quantity = quantity;
	}
	public OrderSaleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
