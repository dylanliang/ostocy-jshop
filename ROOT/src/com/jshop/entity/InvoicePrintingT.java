package com.jshop.entity;

// Generated 2012-6-12 16:11:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * InvoicePrintingT generated by hbm2java
 */
public class InvoicePrintingT implements java.io.Serializable {

	private String invoicePrintingId;
	private String orderid;
	private String operatorname;
	private Date createPrintingTime;

	public InvoicePrintingT() {
	}

	public InvoicePrintingT(String invoicePrintingId, String orderid,
			String operatorname, Date createPrintingTime) {
		this.invoicePrintingId = invoicePrintingId;
		this.orderid = orderid;
		this.operatorname = operatorname;
		this.createPrintingTime = createPrintingTime;
	}

	public String getInvoicePrintingId() {
		return this.invoicePrintingId;
	}

	public void setInvoicePrintingId(String invoicePrintingId) {
		this.invoicePrintingId = invoicePrintingId;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOperatorname() {
		return this.operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	public Date getCreatePrintingTime() {
		return this.createPrintingTime;
	}

	public void setCreatePrintingTime(Date createPrintingTime) {
		this.createPrintingTime = createPrintingTime;
	}

}
