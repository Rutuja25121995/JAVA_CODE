package com.abstractclass;

public class abc {

	public static void main(String[] args) {
		prime();
		System.out.println("------------------------");
		fabo();
		System.out.println("------------------------");
		palindrome();
}

public static void prime() {
	int temp;
	for (int i=2;i<=10;i++) {
		temp=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				temp=temp+1;
				break;
			}
			
		}
		if(temp==0) {
			System.out.println(i);
		}
	}
}

public static void fabo() {
	int num1=0;
	int num2=1;
	int num3=0;
	System.out.println(num1);
	System.out.println(num2);
	for(int i=2;i<=10;i++) {
		num3=num1+num2;
		System.out.println(num3);
		num1=num2;
		num2=num3;
	}
}

public static void palindrome() {
	int num=12321;
	int result=0;
	int temp=num;
	while(num>0) {
		int remain=num%10;
		result=result*10+remain;
	    num=num/10;
	}
	if(temp==result) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
}

}

