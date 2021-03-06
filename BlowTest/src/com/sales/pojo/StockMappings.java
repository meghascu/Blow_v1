package com.sales.pojo;

import com.sales.blow.annotations.BlowId;
import com.sales.blow.annotations.BlowProperty;
import com.sales.blow.annotations.BlowSchema;
import com.sales.blow.annotations.One2One;

@BlowSchema(schemaName="STOCK_MAPPINGS")
public class StockMappings {
	
	@BlowId(generated=true,seq="STOCK_MAPPING_SEQ")
	@BlowProperty(columnName="ID")
	private int id;
	@BlowProperty(columnName="GEN_PROD_ID")
	private double generatedProductId;
	//@BlowProperty(columnName="STOCK_ID")
	private int stockId;
	@BlowProperty(columnName="LOC_ID")
	private int locId;
	@One2One(fk="STOCK_ID",isReferenced=false)
	private Stock stock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public double getGeneratedProductId() {
		return generatedProductId;
	}
	public void setGeneratedProductId(double generatedProductId) {
		this.generatedProductId = generatedProductId;
	}
	
}
