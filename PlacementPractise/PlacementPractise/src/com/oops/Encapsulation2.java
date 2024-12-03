package com.oops;

public class Encapsulation2 {
	private float a;
	
	public float getA() {
		return a;
	}
	
	public void setA(float a) {
		this.a=a;
	}
	
	public static void main(String[] args) {
		Encapsulation2 en2=new Encapsulation2();
		en2.setA(20.10f);
		System.out.println(en2.getA());
	}
	

}
