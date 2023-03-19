package com.damlaerismis;

public class DikUcgen extends Sekil{
	
	private int dikKenar1;
	private int dikKenar2;
	
	
	
	public DikUcgen(int dikKenar1, int dikKenar2) {
		super();
		this.dikKenar1 = dikKenar1;
		this.dikKenar2 = dikKenar2;
	}



	public int getDikKenar1() {
		return dikKenar1;
	}



	public void setDikKenar1(int dikKenar1) {
		this.dikKenar1 = dikKenar1;
	}



	public int getDikKenar2() {
		return dikKenar2;
	}



	@Override
	public String toString() {
		return "DikUcgen [dikKenar1=" + dikKenar1 + ", dikKenar2=" + dikKenar2 + "]";
	}



	public void setDikKenar2(int dikKenar2) {
		this.dikKenar2 = dikKenar2;
	}



	@Override
	public int alanHesapla() {
		return (dikKenar1*dikKenar2)/2;
	}
	
	

}
