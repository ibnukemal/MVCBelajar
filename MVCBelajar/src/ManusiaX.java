
public class ManusiaX implements IGuru, IOlahragawan {

	Guru guru;
	Olahragawan olahragawan;
	@Override
	public void mengajarDariGuru(Guru guru) {
		// TODO Auto-generated method stub
		this.guru = guru;
	}

	@Override
	public void mengajarSendiri() {
		// TODO Auto-generated method stub
		System.out.print("katanya");
		guru.mengajarSendiri() ;
		
	}

	@Override
	public void berlari(Olahragawan berlari) {
		// TODO Auto-generated method stub
		this.olahragawan = berlari;
	}

	@Override
	public void berlariSendiri() {
		// TODO Auto-generated method stub
		this.olahragawan.berlariSendiri();
	}

}
