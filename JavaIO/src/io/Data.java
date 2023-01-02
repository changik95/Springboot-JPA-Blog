package io;

import java.io.Serializable;

public class Data implements Serializable{ // ��ü�� ����ȭ ��
	private static final long serialVersionUID = -8059922862602254185L; //�ø������uid��°ŷ� �ƹ����ڳ� ������ ���� �ᵵ��
	// private = �ܺο������Ұ� static = ���� , ��ü����ȭ�� = ������ �ؼ� �ް� �ٽ� Ǯ� �ϴ°�
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
