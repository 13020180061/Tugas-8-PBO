/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 3 Mei 2020
	Waktu	: 23.29 WITA 	
*/

public class GetterSetter{
	private String nidn;
	private String nama;
	private String jurusan;
	private String fakultas;
	private String email;

	public String getNidn(){
	return this.nidn;	
	}

	public void setNidn(String nidn){
	this.nidn=nidn;
	}

	public String getNama(){
	return this.nama;	
	}

	public void setNama(String nama){
	this.nama=nama;
	}

	public String getJurusan(){
	return this.jurusan;	
	}

	public void setJurusan(String jurusan){
	this.jurusan=jurusan;
	}

	public String getFakultas(){
	return this.fakultas;	
	}

	public void setFakultas(String fakultas){
	this.fakultas=fakultas;
	}

	public String getEmail(){
	return this.email;	
	}

	public void setEmail(String email){
	this.email=email;
	}
}