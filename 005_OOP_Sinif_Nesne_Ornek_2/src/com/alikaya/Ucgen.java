package com.alikaya;

public class Ucgen {

	
	public int kenar1;
	public int kenar2;
	public int kenar3;
	
	public int ucgenCevresi() {
		return (kenar1+kenar2+kenar3);
	}
	
	//protected bir metod olduğu için sadece alinin com.alikaya paketi içindeki sınıflar ulaşabilir.
	protected void kenarlariUzat(int uzatmaMiktari) {
		kenar1 += uzatmaMiktari;
		kenar2 += uzatmaMiktari;
		kenar3 += uzatmaMiktari;
	}
	
	//proxy metod
	//protected olan metodu public metodun içinde çalıştırdığı için
	//artık protected metod public gibi davranır.
	//yani uzatmaMiktari metodunu başka paketlerden çağırabilir artık
	public void kereminMetodu(int uzamaMiktari) {
		kenarlariUzat(uzamaMiktari);
	}
	
}
