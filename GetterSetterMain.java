/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 3 Mei 2020
	Waktu	: 23.41 WITA 	
*/

public class GetterSetterMain{
public static void main(String[] args){
	GetterSetter tugas = new GetterSetter();

	tugas.setNidn("13020180061");
	tugas.setNama("St. Hatijah H.Ilyas");
	tugas.setJurusan("Teknik Informatika");
	tugas.setFakultas("Ilmu Komputer");
	tugas.setEmail("st.hatijahilyas@gmail.com");

	System.out.println ("Nidn \t\t: " + tugas.getNidn());
	System.out.println ("Nama Dosen \t: " +tugas.getNama());
	System.out.println ("Jurusan \t: " +tugas.getJurusan());
	System.out.println ("Fakultas \t: " +tugas.getFakultas());
	System.out.println ("Email \t\t: " +tugas.getEmail());
}
}