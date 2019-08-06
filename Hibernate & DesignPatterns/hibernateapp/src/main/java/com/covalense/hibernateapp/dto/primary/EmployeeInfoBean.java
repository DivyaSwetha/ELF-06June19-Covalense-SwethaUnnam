package com.covalense.hibernateapp.dto.primary;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.hibernateapp.dto.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.dto.EmployeeEducationalInfo;
import com.covalense.hibernateapp.dto.EmployeeExperienceInfoBean;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.dto.TrainingInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {
	
    @OneToOne(cascade=CascadeType.ALL,mappedBy = "empInfo")
	private EmployeeOtherInfoBean employeeOtherInfo;
	
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "addressPKBean.empInfo")
    private List<EmployeeAddressInfoBean> addressInfoBeans;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "empEducationInfo.empInfo")
    private List<EmployeeEducationalInfo> educationInfoBeans;
	
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "empPKBean.empInfo")
    private List<EmployeeExperienceInfoBean> experienceInfoBeans;
    
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "empInfoBeans")
    private List<TrainingInfoBean> trainingInfoBeans;
    
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SALARY")
	private double salary;

	@Column(name = "PHONE")
	private long phone;

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "ACCOUNT_NUMBER")
	private long accountNumber;
	

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "DOB")
	private Date dob;
    @ManyToOne
	@JoinColumn(name = "DEPT_ID",referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean deptId;
	/*
	 * @Column(name = "MNGR_ID") private int mngrId;
	 */
	
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name="MNGR_ID",referencedColumnName = "ID")
	private EmployeeInfoBean mngrId;

}
