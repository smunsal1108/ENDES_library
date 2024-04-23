package com.endes.library;

public class BookItem {
	
	private String barcode;
	private String rfid;
	private Boolean isRefereceOnly;
	
	public BookItem(String barcode, String rfid, Boolean isRefereceOnly) {
		this.barcode = barcode;
		this.rfid = rfid;
		this.isRefereceOnly = isRefereceOnly;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public Boolean getIsRefereceOnly() {
		return isRefereceOnly;
	}

	public void setIsRefereceOnly(Boolean isRefereceOnly) {
		this.isRefereceOnly = isRefereceOnly;
	}
	
	
	
}
