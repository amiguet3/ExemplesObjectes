package com.amiguet;

import java.util.ArrayList;

public class Carretera {
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
			if (nCotxes > 1) r.add(i);
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
			tick();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void tick(){
		for(Cotxe c : cotxes){
			c.setPos(c.getPos() + c.getVelocitad());
		}
		for(int i = 0; i < cotxes.size(); i++){
			Cotxe d = cotxes.get(i);
			System.out.println(d.getPos());
		}
	}
}
