package es.techtalents.principiantes;

import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*6. Programa Java que declare una variable entera n y asígnale un valor. 
 * A continuación escribe las instrucciones que realicen lo siguiente: 
 * Incrementar n en 77, 
 * Decrementarla en 3, 
 * Duplicar su valor. 
 * 
 * Muestra el valor de la variable despues de cada cambio
 * */
public class Ejercicio6 extends Ejercicio{
	
	public Ejercicio6(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		//SOLUCION
		int n =8;
		print ("n vale: " + n);
		
		n= n+77;
		print ("Despues de primer cambio n vale: " + n);
		
		n= n-3;
		print ("Despues del segundo cambio n vale: " + n);
		
		n= n*2;
		print ("Despues del tercer cambio n vale: " + n);
		
				
		
		
		
		
	}
	
}
