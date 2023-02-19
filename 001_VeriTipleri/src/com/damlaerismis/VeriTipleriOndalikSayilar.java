package com.damlaerismis;

public class VeriTipleriOndalikSayilar {

	public static void main(String[] args) {

		// float : 4 byte
		//
		// precision (noktadan sonraki hassasiyet ) : 7 decimal(ondalık) digits.
		// bilimsel hesaplamalarda kullanırsanız veri kaybedebilirsiniz. sonuç yanlış
		// çıkabilir.
		// fizikçiler veya kimyacılar atomla molekülle uğraşanlar kullanmaz.

		float floatValue = 1.2f;
		System.out.println("floatValue: " + floatValue);
		System.out.println("Floatmin: " + Float.MIN_VALUE);
		System.out.println("Floatmax: " + Float.MAX_VALUE);

		floatValue = 22;
		System.out.println(floatValue);
		floatValue = 22.4f; // ondalık sayılarda default atama sağ tarafı double tutar.
							// senin float olduğunu belirtmen lazım.

		// double 8 byte
		// precision (noktadan sonraki hassasiyet ) : 15 decimal(ondalık) digits.
		double doubleValue = 1.2;
		doubleValue = 23332312312312132.123456789101245;
		System.out.println("DoubleMin: " + Double.MIN_VALUE);
		System.out.println("DoubleMax: " + Double.MAX_VALUE);

		doubleValue = 2345.55778;
		System.out.println(doubleValue);

		// Örnek:
		doubleValue = 23.123456789;
		floatValue = (float) doubleValue;
		System.out.println(floatValue);

		floatValue = 25.1234567F; // floatValue = 1.1234567F; =>hocanın örneği
		System.out.println(floatValue);

		String kusuratliSayi = String.format("Sayı: %.2f", floatValue);
		System.out.println(kusuratliSayi);

		final double PI = 3.14; // Başında final kullanılırsa, artık PI değişken olmaz sabit(constant) olur.
		final int maxOgrenciSayisi = 24;
		System.out.println(maxOgrenciSayisi);

	}

}
