/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 3 Mei 2020
	Waktu	: 16.36 WITA 	
*/

public class KonsMetThis{
String nama, alamat;
	void biodata(String nama, String alamat){
	this.nama = nama;
	this.alamat = alamat;
}

public static void main(String[] args){
	KonsMetThis bio = new KonsMetThis();
	bio.biodata("Hatijah","Makassar");
	System.out.println("Nama : " + bio.nama);
	System.out.println("Alamat : " + bio.alamat);
}
}