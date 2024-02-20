package exercise3;

public class Exercise3_1 {
	
public static void main(String[] args) {
		
		// Luokka Area
		
		// Kolmio
		
		Area k = (base, height) -> (base * height) / 2;	
		double kans = k.calculateArea(10, 3);
		System.out.println(kans);
			
		// Suorakulmio
		
		Area s = (base, height) -> base * height;
		double sans = s.calculateArea(12, 3);
		System.out.println(sans);
	}


}
