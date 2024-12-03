package com.string;

public class stringclass {

	public static void main(String[] args) {
		
		String s="institute";
		System.out.println(s.length());
		
		String s1=s.toUpperCase();
		System.out.println(s1);
		
		String s2=s1.toLowerCase();
		System.out.println(s2);
		
		String s3=s2.concat(" fusion");
        System.out.println(s3);
        
        String s4=s3.replace('n', 'N');
        System.out.println(s4);
        
        String s5=s4.replaceAll("te", "TE");
        System.out.println(s5);
        
        String s6=s.substring(0, 3);
        System.out.println(s6);
        
       char s7=s.charAt(1);
       System.out.println(s7);
        
	}

}
