package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable {
	@ManyToOne
	@JoinColumn(name="ID")
	private EmployeeInfoBean empInfo;
	@Column(name="ADDRESS_TYPE")
	private String addressType;
}
