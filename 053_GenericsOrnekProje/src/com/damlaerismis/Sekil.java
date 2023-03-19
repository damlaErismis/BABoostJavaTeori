package com.damlaerismis;

public abstract class Sekil {
	//soyut bir sınıftan nesne türetilemez.
	//inheritance için kullanılır
	//abstract sınıfın içindeki method abstract olacak diye bir şey yok
	//ama abstract methodlar yalnızca abstract class içinde olabilir.
	
	//abstract metod içinde code body olmaz. sadece methodun signature'ı olur.
	//aşağıdaki methodu abstract bıraktık ki her bir geometrik class
	//kendine özgü bir alan hesaplama methodu yazsın dye.
	public abstract int alanHesapla(); 
	
	
	

}
