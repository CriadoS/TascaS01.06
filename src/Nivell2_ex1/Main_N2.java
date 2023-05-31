package Nivell2_ex1;

public class Main_N2 {

	public static void main(String[] args) {
		
		//Exercici nivell 2. 1 
		
		PersonaN2 persona1 = new PersonaN2("Silvia","Criado", 34);
		
		GenericMethodN2 prova1 = new GenericMethodN2(persona1,"hola", 14);  // passo per parametre, els tipus persona i String i int que és
		// no genèric. No és pot canviar l'ordre del paràmetre no genèric
		
		prova1.toString(); //crida la mètode de la clase Generic 
		
		System.out.println(prova1.toString()); //mostro per pantalla les dades
		

		//GenericMethodN2 prova2 = new GenericMethodN2(1,"adeu",persona1); 
		//Si intento canviar l'ordre dels paràmetres no funciona, perquè int ha de ser l'últim paràmetre 
		
		
	
		/* Exercici nivell 2.2 
		 * Modifica l'apartat anterior de manera que els arguments 
		 * del mètode genèric siguin una llista d'arguments de variable indefinida.
		 */
		
		GenericMethodN2_2 prova2 = new GenericMethodN2_2(); 
		
		prova2.imprimirArguments(persona1,"Hola",152, "soc string",5.2); // puc passar-li una llista de paràmetres
		
		System.out.println("---------------------------------");
		prova2.imprimirArguments(5.2,persona1,"hola","soc String",152); // puc canviar l'ordre 
		
		
		
		
	}

}
