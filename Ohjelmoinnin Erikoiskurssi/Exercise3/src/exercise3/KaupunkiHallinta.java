package exercise3;

import java.util.ArrayList;
import java.util.List;


public class KaupunkiHallinta {

	private List<Kaupunki> kaupungit;
 	
 	public KaupunkiHallinta() {
 		this.kaupungit = new ArrayList<>();
 	}
 	
 	public void lisääKaupunki(Kaupunki kaupunki) {
 		kaupungit.add(kaupunki);
 	}
 	
 	public List<Kaupunki> getKaupunkis() {
 		return kaupungit;
 	}
 	
}
