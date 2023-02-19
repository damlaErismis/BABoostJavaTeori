package com.damlaerismis;

public class Motor {
	
	public int motorHacmi;
	public String saseNo;
	public int yakitTuketimi;  // lt/100km
	
	public void motorBilgileriniYazdir() {
		System.out.println("motor hacmi: " + this.motorHacmi + " saseNo: " + this.saseNo + " yakıt tüketimi: " + this.yakitTuketimi);
	}

}
