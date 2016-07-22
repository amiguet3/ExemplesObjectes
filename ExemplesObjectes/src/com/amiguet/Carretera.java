package com.amiguet;

import java.util.ArrayList;

public class Carretera {
	int nCotxesExplotats = 0;
	private ArrayList<Cotxe> cotxes = new ArrayList<Cotxe>();
	int maxPos = 100;
	public void setCotxes(ArrayList<Cotxe> cotxes) {
		this.cotxes = cotxes;
	}
	public ArrayList<Integer> getXocs(){
		ArrayList<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i <= maxPos; i++){
			int nCotxes = 0;
			for (int j = 0; j < cotxes.size(); j++){
				if (i == cotxes.get(j).getPos()){
					nCotxes++;
				}
			}
			if (nCotxes > 1 || (nCotxes == 1 && i == maxPos)) r.add(i);
		}
		return r;
	}


	public int getMaxPos() {
		return maxPos;
	}

	public void setMaxPos(int maxPos) {
		this.maxPos = maxPos;
	}
	public void start(){
		while (true){
			print();
			tick();
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void tick(){
		explotar();
		for(Cotxe c : cotxes){
			c.setPos(c.getPos() + c.getVelocitat());
			
		}
	}
	public void explotar (){
		ArrayList<Integer> xocs = getXocs();
		for(int xoc : xocs){
			ArrayList<Cotxe> toRemove = new ArrayList<Cotxe>();
			for (int i = 0; i < cotxes.size(); i++){
				if (xoc == cotxes.get(i).getPos()){
					toRemove.add(cotxes.get(i));
					if(cotxes.get(i).getPos() > maxPos){
						xocs.add(maxPos);
						System.out.println();
					}
				}
			}
			for(Cotxe r : toRemove){
				cotxes.remove(r);
				nCotxesExplotats++;
				
			}
		}
	}
	public void print(){
		for (int i = 0; i <= maxPos; i++){
			int nCotxes = 0;
			for (int j = 0; j < cotxes.size(); j++){
				if (i == cotxes.get(j).getPos()){
					nCotxes++;
				}
			}
			boolean xoc = getXocs().contains(i);
			if (nCotxes == 0) System.out.print("-");
			if (nCotxes == 1 && !xoc) System.out.print("C");
			if (xoc) System.out.print("X");
		}
		System.out.println("[" + cotxes.size() + " (" + nCotxesExplotats + ")" + "]");
	}
}