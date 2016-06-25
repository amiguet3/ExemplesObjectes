package com.amiguet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calla");

		Cotxe c = new Cotxe();
		Cotxe b = new Cotxe();
		Cotxe d = new Cotxe();
		c.setnRodes(4);
		b.setnRodes(3);
		d.setnRodes(5);
		System.out.println(c.getnRodes() + b.getnRodes() + d.getnRodes());
	}

}
