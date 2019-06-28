package com.covalense.javaapp.equlaityofobjects;

public class Student {
	private String name;
	private int percentage;
	private int id;

	public Student(String name, int percentage, int id) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getPercentage() {
		return percentage;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", percentage=" + percentage + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + percentage;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (percentage != other.percentage)
			return false;
		return true;
	}

	
}
