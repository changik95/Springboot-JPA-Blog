package oop2;

import oop1.Data;

public class DataTest {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.print();
		
		Data d2 = new Data();
		d2.print();
		
		Data d3 = new Data();
		d3.print();
		
		System.out.println(d1.num);
		System.out.println(Data.stnum);
		System.out.println(Data.finum);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	
	}

}
