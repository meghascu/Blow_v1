package com.customer.pojo;

import com.sales.blow.annotations.BlowId;
import com.sales.blow.annotations.BlowProperty;
import com.sales.blow.annotations.BlowSchema;

@BlowSchema(schemaName="Contact")
public class Contact {
	@BlowId
	@BlowProperty(columnName="ID",length=5)
	private int id;
	@BlowProperty(columnName="CUSTomer_ID",length=5)
	private int custId;
	@BlowProperty(columnName="mobile",length=12)
	private Long mobile;
	@BlowProperty(columnName="telephone",length=12)
	private Long tel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	
	public boolean equals(Object contact){
		if(contact instanceof Contact)
			if(this.id==((Contact)contact).id)
				return true;
		return false;
	}
}
