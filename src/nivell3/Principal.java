package nivell3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone smartphone1 = new Smartphone(); //objecte smartphone
		
		Generica generica = new Generica (); // crear la classe generica 
		
		generica.ferFotos(smartphone1); //l'objecte generica crida al metode fer fotos que reb per parametre un smartphone
		
		generica.trucar(smartphone1); //l'objecte generica crida al metode trucar que reb per parametre un smartphone

		
		/*El mètode limitat per la interfície Telefon, de la classe Genèrica, pot cridar al mètode ferFotos()?
		 * 
		 * No, perquè el metòde limitat de la interfície Telèfon no pot cridar al mètode Smartphone. Només poden 
		 * accedir els T que són Smartphones o les seves subclasses. 
		 *  
		 */
		
		
	}

}
