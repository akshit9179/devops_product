package com;

public class Prime {
	boolean checkPrime(int a) {
		if(a==0||a==1) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p = new Prime();
		boolean ans = p.checkPrime(4);
		System.out.println(ans);
	}

}
