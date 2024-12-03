package com.practise;

public class AccessSpecifires {

	public static void main(String[] args) {
		b r=new b();
		 System.out.println(r.a);
		//System.out.println(r.str);
		 System.out.println(r.b);

	}

}
class b{
	int a=50;
	private String str;
	boolean b=true;
	
}
