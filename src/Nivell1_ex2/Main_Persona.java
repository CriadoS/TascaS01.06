package Nivell1_ex2;

public class Main_Persona {

	public static void main(String[] args) {
		/*	Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments
		 *  de tipus genèric. 
		 * Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. 
		 * Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.
			Exemple: un objecte de la classe Persona, un String i un tipus primitiu.

			D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre. 
		 * 
		 */
		Persona persona1 = new Persona("Silvia","Criado", 34);
		
		GenericMethod prova1 = new GenericMethod(persona1,"hola", 14);
		
		prova1.toString(); //crida la mètode de la clase Generic 
		
		System.out.println(prova1.toString()); //mostro per pantalla les dades
		
		GenericMethod prova2 = new GenericMethod(1,"adeu",persona1); // pot agafar-lo en diferent ordre 
		
		
		System.out.println(prova2.toString());
		
		
		
		
		
		
		
		

	}

}
