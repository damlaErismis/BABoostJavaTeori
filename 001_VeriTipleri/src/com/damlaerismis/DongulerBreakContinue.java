package com.damlaerismis;

public class DongulerBreakContinue {

	public static void main(String[] args) {
		
		//break
		//
		//döngünün akışını durdurur ve } sonrasındaki koda gider..
		
//		for(int i=0;i<10;i++) {
//			
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("hoşçakalın..\n");
	
	
		//continue
		//
		//döngünün dışına çıkarmaz ancak bir sonraki şndexe devam ettirir.
		
//		for(int i=0;i<10;i++) {
//			
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
	
		//örnek:
		int sayac =0;
		while(sayac<0) {
			if(sayac==7)
				break;
			sayac++;
			System.out.println(sayac);
		}
	
	}

}
