package com.ghl.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class Ent {
	@Length(min = 5, max = 50,message="{valid.ent.ent_name.length}")
	private String ent_name;
	
	private String biz_lic;
	@NotNull(message="{valid.ent.fnd_date.notnull}")
	@Past(message="{valid.ent.fnd_date.past}")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date fnd_date;
	public String getEnt_name() {
		return ent_name;
	}
	public void setEnt_name(String ent_name) {
		this.ent_name = ent_name;
	}
	public String getBiz_lic() {
		return biz_lic;
	}
	public void setBiz_lic(String biz_lic) {
		this.biz_lic = biz_lic;
	}
	public Date getFnd_date() {
		return fnd_date;
	}
	public void setFnd_date(Date fnd_date) {
		this.fnd_date = fnd_date;
	}
	
}
