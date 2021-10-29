package zadatak1;

public class SlozeniKalkulator {

	
	
	double podeli(double x, double y) {
		return x/y;
	}
	
	
	int podeli(int x, int y) {
		return x/y;
	}

	
	int podeliMod(int x, int y) {
		return x % y; // % nam govori ostatak pri deljenju
	}
	
	
	
	void ispisiPedesetPuta(int x) {
		for(int i=0; i<50; i++) {
			System.out.println(x);
			
		}
	}
	
	
	void ispisi1Do100() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);

		}
	}
	
	
	
	
	static int suma(int n) {
		int suma=0;
		for(int i=1; i<=n; i++) {
			suma=suma+1;
		}
		return suma;
	}
	
	
	
	
	
	
	static double stepenX(double x, int n) {
		//Math. 
		double suma = 1;
		
		for(int i=1; i<=n; i++) {
			suma=suma*x;
			
		}
		
		return suma;
	}
	
	
	
	static int minStepenDva(int broj) {//6 //stepeni 2: 2 4 8 16 32...
		int stependvojke=1;
		/*for( int i=1; i<broj; i++) {
			rezultat=rezultat*2;
			if(rezultat>broj)
				return rezultat;
		}
		*/
		
		
		while(stependvojke<broj)
			stependvojke=stependvojke*2;// 1. iteracija rez=2; druga iter 4; treca iter 8, vraca se //trazimo 1. stepen dvojke veci od unetog
		return stependvojke;
	}
	
	
	
	static void deliSaDva(int broj) {//33
		while(broj>1) {
			broj=broj/2;//2-->16, pa 8, pa 4, pa 2, pa 1
			System.out.println(broj);
		
	}
	}
	
	
	
}
