package pachet1;

public class Main {
	public static void main(String[] args) {
		String[] destinatii = {"Malta, Olanda, Georgia"};
		Pachete pachet = new Pachete("Cipru ieftin si bun", 10000, "Calatorie in Cipru", "Mi-a placut enorm", destinatii);
		
		pachet.afisareInformatiiPachet();
	}
}
