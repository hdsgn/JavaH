package hdasgin.base.derstekrar;

public class Parametre {
public Parametre() {
	String ad= "hacer";
	String soyad= "DA�GIN";
	String isimSoyisim= IsimSoyisim (ad, soyad);
	System.out.println(isimSoyisim);

}
private String IsimSoyisim(String ad, String soyad) {
	return ad+" "+soyad;
	
}

}
