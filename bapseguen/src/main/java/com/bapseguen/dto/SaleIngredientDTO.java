package com.bapseguen.dto;

public class SaleIngredientDTO {
//	CREATE TABLE TBL_SALE_INGREDIENT (
//			SALE_POST_NUMBER  NUMBER,
//			UNIT              VARCHAR2(20),
//			EXPIRATION_DATE   DATE NOT NULL,
//			CONSTRAINT PK_TBL_SALE_INGREDIENT PRIMARY KEY (SALE_POST_NUMBER),
//			CONSTRAINT FK_TBL_SALE_INGREDIENT_POST
//			FOREIGN KEY (SALE_POST_NUMBER) REFERENCES TBL_SALE_POST(SALE_POST_NUMBER)
//			ON DELETE CASCADE
//			);
	private int salePostNumber;
	private String unit;
	private String expipationDate;
	
	public int getSalePostNumber() {
		return salePostNumber;
	}
	public void setSalePostNumber(int salePostNumber) {
		this.salePostNumber = salePostNumber;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getExpipationDate() {
		return expipationDate;
	}
	public void setExpipationDate(String expipationDate) {
		this.expipationDate = expipationDate;
	}
	
	@Override
	public String toString() {
		return "SaleIngredientDTO [salePostNumber=" + salePostNumber + ", unit=" + unit + ", expipationDate="
				+ expipationDate + "]";
	}
	
	
}
