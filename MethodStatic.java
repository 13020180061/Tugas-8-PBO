/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 3 Mei 2020
	Waktu	: 22.14 WITA 	
*/

public class MethodStatic {
	String nama, kuliah;

	static void Cetaknama(String nama){
		System.out.println("Nama saya " +nama);
	}

	static void Cetakkuliah(String kuliah){
		System.out.println("Saya Kuliah di " +kuliah);
	}

public static void main(String[] args){
	Cetaknama("Hatijah");
	Cetakkuliah("UMI");
}
}