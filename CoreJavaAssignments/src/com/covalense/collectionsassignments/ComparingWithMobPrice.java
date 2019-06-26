package com.covalense.collectionsassignments;

import java.util.Comparator;

public class ComparingWithMobPrice implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {

		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}
