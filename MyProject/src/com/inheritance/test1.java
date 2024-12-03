package com.inheritance;

class Animal1{
    public void eat() {
		System.out.println("eating");
	 } 
}

class dog1 extends Animal1 {
void bark() {
	 System.out.println("dog is barking");
}
}

class childdog extends dog1{
void bark() 
{
	 System.out.println("dog is barking....");
}
}
public class test1 {
	
	public static void main(String[] args) {
		childdog d1=new childdog();
		d1.bark();		
		d1.eat();
		
		dog1 d2=new dog1();
		
		d2.bark();
		d2.eat();
	}

}

