package Nivell2_ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodN2_2 <T>{
	
	public <T> void imprimirArguments(T... arguments) { //el T....fa que sigui una llista de paràmetres del tipus T
       
		for (T argument : arguments) { // recorre la llista d'arguments i accedeix a cada un d'ells.
            
			System.out.println("Paràmetres: " + argument);
        }
    }

    

}
