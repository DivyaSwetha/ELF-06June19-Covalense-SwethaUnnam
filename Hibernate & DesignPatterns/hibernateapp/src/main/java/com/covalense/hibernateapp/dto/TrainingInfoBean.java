package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="training_info")
public class TrainingInfoBean {
	@Id
	@Column(name="COURSE_ID")
	private int course_id;
	@Column(name="COURSE_NAME")
	private String course_name;
	@Column(name="DURATION")
	private String duration;
	@Column(name="COURSE_TYPE")
	private String course_type;

}
