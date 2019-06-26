package com.covalense.javaapp.beanformatemp;

public class MyArray {
	private Object[] myArray;
	private int index;

	public MyArray() {
		this(10);
	}

	public MyArray(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than or equal to zero");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {

		if (index >= myArray.length) {
			Object[] myArrayNew = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, myArrayNew, 0, myArray.length - 1);
			myArray = myArrayNew;
		}
		myArray[index] = val;
		index++;
	}

	public int getSize() {
		return index - 1;
	}

	public Object get(int whichIndex) {
		return myArray[whichIndex];
	}

	public void remove(int atIndex) {
		/*
		 * while(atIndex<=myArray.length-2) { myArray[atIndex]=myArray[atIndex+1];
		 * atIndex++; } myArray[atIndex]=null;
		 */
		if (atIndex >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			System.arraycopy(myArray, (atIndex + 1), myArray, atIndex, myArray.length-1-atIndex);
			myArray[myArray.length - 1] = null;
		}

	}
}
