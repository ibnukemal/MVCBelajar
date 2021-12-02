import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		   Guru guru = new Guru();
		   Olahragawan olahragawan = new Olahragawan();
		   
		   ManusiaX manusiax = new ManusiaX();
		   
		   manusiax.mengajarDariGuru(guru);
		   manusiax.berlari(olahragawan);
		   
		   List<IGuru> lstGuru= new ArrayList<IGuru>();
		   
		   lstGuru.add(guru);
		   lstGuru.add(manusiax);
		   
		   for (IGuru iGuru : lstGuru) {
			iGuru.mengajarSendiri();
		}
		    
		   List<IOlahragawan> lstOlahragawans = new ArrayList<IOlahragawan>();
		   lstOlahragawans.add(olahragawan);
		   lstOlahragawans.add(manusiax);
		   
		   for (IOlahragawan iOlahragawan : lstOlahragawans) {
			iOlahragawan.berlariSendiri();
		}
		   
		   
	}

}
