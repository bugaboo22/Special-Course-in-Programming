package exercise3;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise3_2 {

public static void main(String[] args) {
		
		KaupunkiHallinta kaupunkiHallinta = new KaupunkiHallinta();
		
		kaupunkiHallinta.lisääKaupunki(new Kaupunki("New York", "USA", 8419000));
		kaupunkiHallinta.lisääKaupunki(new Kaupunki("Tokyo", "Japani", 13960000));
		kaupunkiHallinta.lisääKaupunki(new Kaupunki("Helsinki", "Suomi", 603100));
		kaupunkiHallinta.lisääKaupunki(new Kaupunki("London", "UK", 8982000));
		kaupunkiHallinta.lisääKaupunki(new Kaupunki("Tampere", "Suomi", 230142));
		kaupunkiHallinta.lisääKaupunki(new Kaupunki("Turku", "Suomi", 200142));
		
		// T.1 Stream-virtoja käyttäen tulosta kaikki kaupungit.
		kaupunkiHallinta.getKaupunkis().stream()
			.forEach(Kaupunki -> System.out.println("Kaupunki: " + Kaupunki.getNimi() + ", Maa: " +  Kaupunki.getMaa() 
			+ " , väkiluku: " + Kaupunki.getAsukasluku()));
		
		// T.2 Suodata joukosta kaikki suomalaiset kaupungit ja tulosta ne.
		System.out.println("\nAlla olevat kaupungit ovat vain Suomessa:");
		kaupunkiHallinta.getKaupunkis().stream()
			.filter(Kaupunki -> Kaupunki.getMaa().equals("Suomi"))
			.forEach(Kaupunki -> System.out.println("Kaupunki: " + Kaupunki.getNimi() + ", Maa: " +  Kaupunki.getMaa() 
			+ " , väkiluku: " + Kaupunki.getAsukasluku()));
		
		// T.3 Suodatetaan ja tallennetaan uuteen Set-kokoelmaan kaupunkien nimet, joiden asukasluku on 200000-300000
		Set<String> suodatetutKaupungkit = kaupunkiHallinta.getKaupunkis().stream()
				.filter(Kaupunki -> Kaupunki.getAsukasluku() >= 200000 && Kaupunki.getAsukasluku() <= 300000)
				.map(Kaupunki -> Kaupunki.getNimi())
				.collect(Collectors.toSet());
		System.out.println("Kaupungit, joiden väkiluku on 200 000 - 300 000 välillä");
		suodatetutKaupungkit.forEach(nimi -> System.out.println(nimi));
	}
	
}
