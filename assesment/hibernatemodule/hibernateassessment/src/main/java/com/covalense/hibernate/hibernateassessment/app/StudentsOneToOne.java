package com.covalense.hibernate.hibernateassessment.app;

import com.covalense.hibernate.hibernateassessment.dto.StudentInfoBean;
import com.covalense.hibernate.hibernateassessment.dto.StudentOtherBean;

public class StudentsOneToOne {

	public static void main(String[] args) {
		StudentInfoBean stuInfo = new StudentInfoBean();
		stuInfo.setName("Ram");
		stuInfo.setAge(22);
		stuInfo.setEmailId("SS@gmail.com");
		stuInfo.setGender("male");
		stuInfo.setRollNum(1);

		StudentOtherBean stuOther = new StudentOtherBean();
		stuOther.setFirstName("annam");
		stuOther.setLastName("mari");
		stuOther.setNationality("Indian");
		stuOther.setReligion("Hindu");
		stuOther.setRollNum(1);

		stuInfo.setOtherInfo(stuOther);
	}

}
