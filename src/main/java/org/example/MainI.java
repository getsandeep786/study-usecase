package org.example;

public interface MainI{

	public String Sand();

	default void show()
	{
		System.out.println("Main I Interface");
	}

	default void loopy()
	{
		System.out.println("Main I Loopy");
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Main 1 Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}
}
