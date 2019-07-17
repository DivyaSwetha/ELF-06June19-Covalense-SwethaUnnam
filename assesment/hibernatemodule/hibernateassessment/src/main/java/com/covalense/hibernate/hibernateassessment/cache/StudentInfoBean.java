package com.covalense.hibernate.hibernateassessment.cache;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.covalense.hibernate.hibernateassessment.dto.StudentOtherBean;

import lombok.Data;

@Entity
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "student_info")
public class StudentInfoBean {
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentOtherBean otherInfo;
	@Id
	@Column(name = "rollNum")
	private int rollNum;
	@Column(name = "age")
	private int age;
	@Column(name = "name")
	private String name;
	@Column(name = "gender")
	private String gender;
	@Column(name = "emailId")
	private String emailId;
}
