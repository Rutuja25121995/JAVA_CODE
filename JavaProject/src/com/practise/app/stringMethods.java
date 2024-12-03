package com.practise.app;

public class stringMethods {

	public static void main(String[] args) {
		String firstName="rutuja";
		String name="  MAHADEV  ";
		String lastName="khadkikar";
		System.out.println(firstName.length());
		System.out.println(firstName.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.substring(6));
        System.out.println(name.substring(6,8));
		System.out.println(firstName.replace("a","@"));
        System.out.println(firstName.startsWith("ru"));
        System.out.println(lastName.endsWith("kikar"));
        System.out.println(lastName.charAt(2));
        System.out.println(firstName.indexOf("j"));
        //System.out.println(firstName.indexOf());
        
	}

}
