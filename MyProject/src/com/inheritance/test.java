package com.inheritance;


class Animal{
	     public void eat()
	     {
			System.out.println("eating");
		 }
	     public void eat1()
	     {
			System.out.println("eating");
		 }
	 
}
 class dog extends Animal 
 {
	 void bark() 
	 {
		 System.out.println("dog is barking");
	 }
	
}
 public class test {
		
		public static void main(String[] args) {
			dog d=new dog();
			d.bark();
			d.eat();
			
		}

	}
 

