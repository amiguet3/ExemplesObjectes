package com.amiguet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("calla");
		ArrayList<Cotxe> cotxes = new ArrayList<Cotxe>();
		Cotxe c = new Cotxe();
		Cotxe d = new Cotxe();
		Cotxe b = new Cotxe();
		c.setPos(4);
		c.setVelocitat(3);
		d.setPos(10);
		d.setVelocitat(2);
		b.setPos(2);
		b.setVelocitat(5);
		cotxes.add(c);
		cotxes.add(d);
		cotxes.add(b);
		
		Carretera carr =  new Carretera();
		
		carr.setCotxes(cotxes);
		System.out.println(carr.getXocs().toString());
		carr.start();
	}	

}
