package es.techtalents.principiantes;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*9. Programa Java que declare una variable b de tipo entero y una variable s de tipo String
 * 
 * pide al jugador que introduzca su nick por el chat de minecraft y asignalo a la variable s
 * 
 * pide al jugador que introduzca un numero por el chat de minecraft y asignale el numero a la variable.
 * 
 *  A continuación lanza un rayo al jugador si el numero introducido es negativo
 *   Consideraremos el 0 como negativo. 
 *  
 *  pista: usar un condicional (if) y el metodo getInt();
 *  
 *  Muestra el valor de cada variable antes y despues de los cambios
 * */
public class Ejercicio10 extends Ejercicio{
	
	public Ejercicio10(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		
		
		
		//SOLUCION
		int b;
		Location lugar;
		
		String s;
		print("Hola porfavor introduzca su nick de minecraft");
		s = getString();
		
		print("Gracias, ahora introduzca un numero");
		b = getInt();
		
		Player hhh = getPlayer(s);
		
		
		
		if(b <= 0){
			strikeLightning(hhh); 
        }
		
		print("Gracias y ADIOS");		
		
			
		
		
		
		
		
	}
	
}
