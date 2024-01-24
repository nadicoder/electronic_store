package com.project.ElectronicStore.Dto;

import java.util.Date;

public class ProductDto {
	
		
		private String productId;
		private String title;
		private String description;
		private int price;
		private int discountedPrice;
		private int quantity;
		private Date addedDate;
		private boolean live;
		private boolean stock;
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getDiscountedPrice() {
			return discountedPrice;
		}
		public void setDiscountedPrice(int discountedPrice) {
			this.discountedPrice = discountedPrice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Date getAddedDate() {
			return addedDate;
		}
		public void setAddedDate(Date addedDate) {
			this.addedDate = addedDate;
		}
		public boolean isLive() {
			return live;
		}
		public void setLive(boolean live) {
			this.live = live;
		}
		public boolean isStock() {
			return stock;
		}
		public void setStock(boolean stock) {
			this.stock = stock;
		}
		public ProductDto(String productId, String title, String description, int price, int discountedPrice, int quantity,
				Date addedDate, boolean live, boolean stock) {
			super();
			this.productId = productId;
			this.title = title;
			this.description = description;
			this.price = price;
			this.discountedPrice = discountedPrice;
			this.quantity = quantity;
			this.addedDate = addedDate;
			this.live = live;
			this.stock = stock;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", title=" + title + ", description=" + description + ", price="
					+ price + ", discountedPrice=" + discountedPrice + ", quantity=" + quantity + ", addedDate=" + addedDate
					+ ", live=" + live + ", stock=" + stock + "]";
		}
		public ProductDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
		
		
	}



