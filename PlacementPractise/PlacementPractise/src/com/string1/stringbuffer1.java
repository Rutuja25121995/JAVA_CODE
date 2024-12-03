package com.string1;

public class stringbuffer1 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		s.append("java");
		//s.append(1);
		s.insert(5," ");
		s.replace(0, 5,"welcome");
		s.delete(3, 6);
		s.deleteCharAt(3);
		s.capacity();
        System.out.println(s);
        
        StringBuffer s1=new StringBuffer("my name ");
        s1.append("is rutuja");
        s1.length();
       
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.reverse());
        
	}

}
