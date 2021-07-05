package com.xworkz.functionalinterface;

@FunctionalInterface
public interface Cover {
	void store();

	static void reuse(boolean reusable) {
		if (reusable == true)
			System.out.println("reuse the cover");
		else
			System.out.println("cannot reuse");
	}
}