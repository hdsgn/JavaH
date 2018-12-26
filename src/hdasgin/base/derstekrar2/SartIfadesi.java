package hdasgin.base.derstekrar2;

public class SartIfadesi {
	public SartIfadesi() {
		Islem ();
	}
	private void Islem() {
		int deger =10;
	switch (deger) {
	case 0:
		System.out.println("deger 0");
		break;
		
	case 10:
		System.out.println("deger 10");
	
		break;
	case 20:
		System.out.println("deger 20");
		break;
	
	default:
		System.out.println("deger eşitlenmedi");
	}
	}
}
