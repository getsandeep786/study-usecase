package org.example;

public interface MainII{

	public String Sand();

	default void show1()
	{
		System.out.println("Main II Interface");
	}

	static boolean isNull(String str) {
		System.out.println("Interface Main 2 Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}

	default void loopy()
	{
		System.out.println("Main II Loopy");
	}

}
