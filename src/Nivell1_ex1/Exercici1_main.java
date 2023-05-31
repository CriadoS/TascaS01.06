package Nivell1_ex1;

public class Exercici1_main {

	public static void main(String[] args) {
		
		/* Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, 
		 * juntament amb els mètodes per a emmagatzemar  i extreure aquests objectes. i un constructor per a inicialitzar els tres.
		 *  Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
		 *  
		 */
		
		NoGenericMethods nogeneric = new NoGenericMethods("objecte1", "objecte2", "objecte3"); 
		
		System.out.println(nogeneric.toString());
		

	}

}
