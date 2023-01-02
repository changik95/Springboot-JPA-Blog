package io;

import java.io.Serializable;

public class Data implements Serializable{ // 객체를 직렬화 함
	private static final long serialVersionUID = -8059922862602254185L; //시리얼버젼uid라는거로 아무숫자나 대입함 내가 써도됨
	// private = 외부에서사용불가 static = 공용 , 객체직렬화란 = 포장을 해서 받고 다시 풀어서 하는것
	String a;
	int b;
	double c;
	
	public Data() {}

	public Data(String a, int b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Data [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	
	
	
	
	
	
}
