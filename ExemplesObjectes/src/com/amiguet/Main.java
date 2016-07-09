package com.amiguet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("calla");
		int[] arr = {3, 4, 5, 6, 6, 5};
		ArrayList<Cotxe> cotxes = new ArrayList<Cotxe>();
		for(int i = 0; i   < arr .length; i++){
			Cotxe c = new Cotxe();
			c.setPos(arr[i]);
			cotxes.add(c);
		}
		
		Carretera carr =  new Carretera();
		
		carr.setCotxes(cotxes);
		System.out.println(carr.getXocs().toString());
		carr.start();
	}	

}
