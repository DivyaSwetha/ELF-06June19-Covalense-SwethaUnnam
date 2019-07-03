
/**UserCase:Storing 5 student objects into file,
 *  and reading only the students who got more than 80% 
 *  Output:Students who got percentage greater than 80%
 *  				Ram	
 *  				seetha
 *  				sam   */

package com.covalense.filesassignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
public class StudentWrite {

	public static void main(String[] args) {
		Student[] s = new Student[5];

		Student s1 = new Student();
		s1.setName("Ram");
		s1.setPercentage(85);
		s1.setRollNo(1);

		Student s2 = new Student();
		s2.setName("seetha");
		s2.setPercentage(84);
		s2.setRollNo(2);

		Student s3 = new Student();
		s3.setName("sam");
		s3.setPercentage(82);
		s3.setRollNo(3);

		Student s4 = new Student();
		s4.setName("priya");
		s4.setPercentage(78);
		s4.setRollNo(4);

		Student s5 = new Student();
		s5.setName("riya");
		s5.setPercentage(72);
		s5.setRollNo(5);
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;

		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			FileOutputStream fout = new FileOutputStream("studentdata.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			objOut.writeObject(s);

			fin = new FileInputStream("studentdata.txt");
			oin = new ObjectInputStream(fin);

			Student[] st = (Student[]) oin.readObject();
			log.info("Students who got percentage greater than 80%");
			for (int i = 0; i < st.length; i++) {
				if (st[i].getPercentage() > 80) {
					log.info(st[i].getName());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
