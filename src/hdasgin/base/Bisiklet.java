package hdasgin.base;

public class Bisiklet {
	Insan binmisInsan;
public void bin(Insan gelenInsan) {
	
	if (binmisInsan==null)
	{
		binmisInsan=gelenInsan;
		
	}
	

	else
	{
		System.out.println("zaten" + binmisInsan.getIsim() );
}
}
}